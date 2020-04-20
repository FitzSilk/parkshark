package com.teameast.parkshark.domain.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private final ConcurrentHashMap<String, User> userRepository;

    @Autowired
    public UserRepository() {
        this.userRepository = new ConcurrentHashMap<>();
    }

    public Collection<? extends User> getAllUsers() {
        return userRepository.values();
    }

    public void save(User user) {
        userRepository.put(user.getId(), user);
    }
}
