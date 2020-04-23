package com.teameast.parkshark.service.division;

import com.teameast.parkshark.domain.personalinformation.Person;
import com.teameast.parkshark.domain.division.Division;
import com.teameast.parkshark.domain.division.DivisionRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.teameast.parkshark.domain.division.Division.DivisionBuilder.divisionBuilder;

class DivisionServiceTest {

    @Test
    void givenADto_shouldCreate_aNewDivision() {
        /*//GIVEN
        DivisionMapper divisionMapper = new DivisionMapper();
        DivisionRepository divisionRepository = new DivisionRepository();
        DivisionService divisionService = new DivisionService(divisionRepository, divisionMapper);
        Person director = new Person();
        DivisionDto divisionDto = new DivisionDto(1, "Test", "Original Test", director);
        //WHEN
        divisionService.create(divisionDto);
        Division expectedResult = divisionBuilder()
                .withId(1)
                .withName("Test")
                .withOriginalName("Original Test")
                .withDirector(director)
                .build();
        //THEN
        Assertions.assertThat(divisionRepository.findAll().contains(expectedResult));*/
    }

}