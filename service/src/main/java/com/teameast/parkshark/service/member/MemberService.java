package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.UserRepository;
import com.teameast.parkshark.domain.phone.PhoneNumber;
import com.teameast.parkshark.domain.phone.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

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
        PhoneNumber savedNumber = createOrUpdatePhoneNumber(phoneNumber);
        return memberMapper.toDto(userRepository.save(memberMapper.toUser(firstName, lastName, licencePlate, licencePlateCountry, email, address, savedNumber)));
    }

    private PhoneNumber createOrUpdatePhoneNumber(String phoneNumber) {
        PhoneNumber tempNumber, savedNumber;
        tempNumber = checkIfAlreadyExists(phoneNumber);
        savedNumber = createPhoneNumberIfNew(phoneNumber, tempNumber);
        return savedNumber;
    }

    private PhoneNumber createPhoneNumberIfNew(String phoneNumber, PhoneNumber tempNumber) {
        PhoneNumber savedNumber;
        if(tempNumber == null || tempNumber.getPhoneNumber() == null ) {
            tempNumber = new PhoneNumber(phoneNumber);
            savedNumber = phoneRepository.save(tempNumber);
        } else savedNumber = tempNumber;
        return savedNumber;
    }

    private PhoneNumber checkIfAlreadyExists(String phoneNumber) {
        PhoneNumber tempNumber = null;
        for (PhoneNumber number : phoneRepository.findAll()) {
            if(phoneNumber.equals(number.getPhoneNumber())) tempNumber = number;
        }
        return tempNumber;
    }
}
