package com.teameast.parkshark.api.security.authentication;

import com.teameast.parkshark.domain.member.User;
import com.teameast.parkshark.domain.member.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;

    @Autowired
    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String email, String password) {
        return userRepository.findAll().stream()
                .filter(user -> user.getEmail().equals(email))
                .filter(user -> verifyHash(password, user.getPassword()))
                .findFirst()
                .orElse(null);
    }

    public boolean verifyHash(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}
