package com.teameast.parkshark.api.security.authentication;

import com.teameast.parkshark.domain.member.User;
import com.teameast.parkshark.domain.member.UserRepository;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;

    private List<User> usersList = new ArrayList<>();

    @Autowired
    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
        usersList.addAll(userRepository.getAllUsers());
    }

    public User getUser(String email, String password) {
        return usersList.stream()
                .filter(user -> user.getEmail().equals(email))
                .filter(user -> verifyHash(password, user.getPassword()))
                .findFirst()
                .orElse(null);
    }

    public boolean verifyHash(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}
