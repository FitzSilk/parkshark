package com.teameast.parkshark.domain.division;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureTestDatabase
class DivisionRepositoryTest {

    /*private DivisionRepository divisionRepository;

    @Autowired
    public DivisionRepositoryTest(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }*/

    @Test
    void givenADivision_shouldBeAble_toAddItToRepository() {
        /*//GIVEN
        Division newDivision = new Division();
        newDivision.setId(1);
        //WHEN
        divisionRepository.save(newDivision);
        //THEN
        Assertions.assertThat(divisionRepository.findAll().contains(newDivision));*/
    }

}