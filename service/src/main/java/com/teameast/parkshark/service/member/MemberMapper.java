package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.teameast.parkshark.domain.member.User.UserBuilder.userBuilder;

@Component
public class MemberMapper {

    public User toUser(UserDto userDto) {
        return new User(userBuilder()
                .withFirstName(userDto.getFirstName())
                .withLastName(userDto.getLastName())
                .withAddress(userDto.getAddress())
                .withEmail(userDto.getEmail())
                .withLicencePlate(userDto.getLicencePlate())
                .withPhoneNumber(userDto.getPhoneNumber())
                .withRegistrationDate(userDto.getRegistrationDate())
        );
    }

    public UserDto toDto(User user) {
        return null;
    }

    public List<UserDto> toDto(Collection<User> users) {
        return users.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
