package com.teameast.parkshark.domain.division;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionRepositoryTest {

    @Test
    void givenADivision_shouldBeAble_toAddItToRepository() {
        //GIVEN
        DivisionRepository divisionRepository = new DivisionRepository();
        Division newDivision = new Division();
        newDivision.setId(1);
        //WHEN
        divisionRepository.save(newDivision);
        //THEN
        Assertions.assertThat(divisionRepository.getAllDivisions().contains(newDivision));
    }

}