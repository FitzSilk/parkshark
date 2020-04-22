package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.UserRepository;
import com.teameast.parkshark.domain.phone.PhoneNumber;
import com.teameast.parkshark.domain.phone.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {

    private final UserRepository userRepository;
    private final MemberMapper memberMapper;
    private final PhoneRepository phoneRepository;

    @Autowired
    public MemberService(UserRepository userRepository, MemberMapper memberMapper, PhoneRepository phoneRepository) {
        this.userRepository = userRepository;
        this.memberMapper = memberMapper;
        this.phoneRepository = phoneRepository;
    }


    public Collection<UserDto> getAllMembers() {
        return memberMapper.toDto(userRepository.findAll());
    }

    public UserDto getMemberById(int id) {
        return memberMapper.toDto(userRepository.findById(id).orElseThrow());
    }

    public UserDto saveMember(String firstName, String lastName, int licencePlate, String licencePlateCountry, String email, int address, String phoneNumber) {
        List<String> phoneBank = phoneRepository.findAll().stream().map(PhoneNumber::getPhoneNumber).collect(Collectors.toList());
        PhoneNumber phoneNumber1 = new PhoneNumber(phoneNumber);
        PhoneNumber savedPhone = phoneRepository.save(phoneNumber1);
        /*if (phoneBank.contains(phoneNumber)) {
            phoneNumber1 = phoneRepository.findById(phoneRepository.findByValue(phoneNumber)).orElseThrow();
        } else {
            PhoneNumber tempPhoneNumber = new PhoneNumber(phoneNumber);
            phoneNumber1 = phoneRepository.save(tempPhoneNumber);
        }*/
        return memberMapper.toDto(userRepository.save(memberMapper.toUser(firstName, lastName, licencePlate, licencePlateCountry, email, address, savedPhone)));
    }
}
