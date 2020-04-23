package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.MemberAddress;
import com.teameast.parkshark.domain.member.MemberAddressRepository;
import com.teameast.parkshark.domain.member.UserRepository;
import com.teameast.parkshark.domain.phone.PhoneNumber;
import com.teameast.parkshark.domain.phone.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.UUID;

@Transactional
@Service
public class MemberService {

    private final UserRepository userRepository;
    private final MemberMapper memberMapper;
    private final PhoneRepository phoneRepository;
    private final MemberAddressRepository memberAddressRepository;

    @Autowired
    public MemberService(UserRepository userRepository, MemberMapper memberMapper, PhoneRepository phoneRepository, MemberAddressRepository memberAddressRepository) {
        this.userRepository = userRepository;
        this.memberMapper = memberMapper;
        this.phoneRepository = phoneRepository;
        this.memberAddressRepository = memberAddressRepository;
    }


    public Collection<UserDto> getAllMembers() {
        return memberMapper.toDto(userRepository.findAll());
    }

    public UserDto getMemberById(UUID id) {
        return memberMapper.toDto(userRepository.findById(id).orElseThrow());
    }

    public UserDto saveMember(String firstName, String lastName, String licencePlate, String licencePlateCountry, String email, String streetName, String streetNumber, String zipCode, String phoneNumber) {
        PhoneNumber savedNumber = createOrUpdatePhoneNumber(phoneNumber);
        MemberAddress savedAddress = createOrUpdateMemberAddress(streetName, streetNumber, zipCode);
        return memberMapper.toDto(userRepository.save(memberMapper.toUser(firstName, lastName, licencePlate, licencePlateCountry, email, savedAddress, savedNumber)));
    }

    private MemberAddress createOrUpdateMemberAddress(String streetName, String streetNumber, String zipCode) {
        MemberAddress tempAddress, savedAddress;
        tempAddress = checkIfAlreadyExists(streetName, streetNumber, zipCode);
        savedAddress = createMemberAddressIfNew(tempAddress, streetName, streetNumber, zipCode);
        return savedAddress;
    }

    private MemberAddress createMemberAddressIfNew(MemberAddress tempAddress, String streetName, String streetNumber, String zipCode) {
        MemberAddress savedAddress;
        if (tempAddress == null) {
            tempAddress = new MemberAddress(streetName, streetNumber, zipCode);
            savedAddress = memberAddressRepository.save(tempAddress);
        } else savedAddress = tempAddress;
        return savedAddress;
    }

    private PhoneNumber createOrUpdatePhoneNumber(String phoneNumber) {
        PhoneNumber tempNumber, savedNumber;
        tempNumber = checkIfAlreadyExists(phoneNumber);
        savedNumber = createPhoneNumberIfNew(phoneNumber, tempNumber);
        return savedNumber;
    }

    private PhoneNumber createPhoneNumberIfNew(String phoneNumber, PhoneNumber tempNumber) {
        PhoneNumber savedNumber;
        if (tempNumber == null || tempNumber.getPhoneNumber() == null) {
            tempNumber = new PhoneNumber(phoneNumber);
            savedNumber = phoneRepository.save(tempNumber);
        } else savedNumber = tempNumber;
        return savedNumber;
    }

    private PhoneNumber checkIfAlreadyExists(String phoneNumber) {
        PhoneNumber tempNumber = null;
        for (PhoneNumber number : phoneRepository.findAll()) {
            if (phoneNumber.equals(number.getPhoneNumber())) tempNumber = number;
        }
        return tempNumber;
    }

    private MemberAddress checkIfAlreadyExists(String streetName, String streetNumber, String zipCode) {
        MemberAddress tempAddress = null;
        for (MemberAddress address : memberAddressRepository.findAll()) {
            if (address.getPostalCode().equals(zipCode)
                    && address.getStreetName().equals(streetName)
                    && address.getStreetNumber().equals(streetNumber)) {
                tempAddress = address;
            }
        }
        return tempAddress;
    }
}
