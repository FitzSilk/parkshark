package com.teameast.parkshark.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void givenAPerson_shouldBeAble_toRegisterInRepository() {
        //GIVEN
        UserRepository userRepository = new UserRepository();
        User newPerson = new User();
        //WHEN
        userRepository.save(newPerson);
        //THEN
        Assertions.assertThat(userRepository.getAllUsers().contains(newPerson));
    }

}