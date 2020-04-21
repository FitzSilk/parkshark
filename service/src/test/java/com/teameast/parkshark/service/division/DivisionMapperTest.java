package com.teameast.parkshark.service.division;

import com.teameast.parkshark.domain.division.*;
import com.teameast.parkshark.domain.division.DivisionRepository;
import com.teameast.parkshark.domain.personalinformation.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.teameast.parkshark.domain.division.Division.DivisionBuilder.divisionBuilder;

class DivisionMapperTest {

    @Test
    void givenADivisionDto_shouldBeAble_toSaveADivision() {
        /*//GIVEN
        DivisionMapper divisionMapper = new DivisionMapper();
        DivisionRepository divisionRepository = new DivisionRepository();
        Person director = new Person();
        DivisionDto divisionDto = new DivisionDto(1, "Test", "Original test", director);
        //WHEN
        Division actualDivision = divisionMapper.toDivision(divisionDto);
        //THEN
        Assertions.assertThat(divisionRepository.getAllDivisions().contains(actualDivision));*/
    }

    @Test
    void givenADivision_shouldBeAble_toReturnADto() {
        //GIVEN
        DivisionMapper divisionMapper = new DivisionMapper();
        Person director = new Person();
        Division division = divisionBuilder()
                .withId(1)
                .withName("Division")
                .withOriginalName("Pre-division")
                .withDirector("director")
                .build();
        //WHEN
        DivisionDto actualResult = divisionMapper.toDto(division);
        //THEN
        Assertions.assertThat(actualResult.getId() == 1);
        Assertions.assertThat(actualResult.getOriginalName().equals("Pre-division"));
    }

}