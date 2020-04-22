package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MemberMapper {

    public User toUser() {
        return null;
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
