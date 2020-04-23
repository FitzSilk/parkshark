package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.MemberAddress;
import com.teameast.parkshark.domain.member.User;
import com.teameast.parkshark.domain.phone.PhoneNumber;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.teameast.parkshark.domain.member.User.UserBuilder.userBuilder;
import static com.teameast.parkshark.service.member.UserDto.UserDtoBuilder.userDtoBuilder;

@Component
public class MemberMapper {

    public User toUser(String firstName, String lastName, String licencePlate, String licencePlateCountry, String email, MemberAddress address, PhoneNumber phoneNumber) {
        return new User(userBuilder()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withAddress(address)
                .withEmail(email)
                .withLicencePlate(licencePlate)
                .withLicencePlateCountry(licencePlateCountry)
                .withPhoneNumber(phoneNumber)
                .withRegistrationDate(LocalDate.now())
        );
    }

    public UserDto toDto(User user) {
        return new UserDto(userDtoBuilder()
                .withId(user.getId())
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withEmail(user.getEmail())
                .withAddress(user.getAddress())
                .withLicencePlate(user.getLicencePlate())
                .withLicencePlateCountry(user.getLicencePlateCountry())
                .withPhoneNumber(user.getPhoneNumber())
                .withRegistrationDate(user.getRegistrationDate())
        );
    }

    public List<UserDto> toDto(Collection<User> users) {
        return users.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
