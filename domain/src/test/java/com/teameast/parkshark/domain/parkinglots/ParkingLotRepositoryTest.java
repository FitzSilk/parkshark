package com.teameast.parkshark.domain.parkinglots;

import com.teameast.parkshark.domain.personalinformation.Address;
import com.teameast.parkshark.domain.personalinformation.Person;
import com.teameast.parkshark.domain.personalinformation.PostCode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest(classes={ParkingLotRepository.class,ParkingLot.class})
class ParkingLotRepositoryTest {

    private ParkingLotRepository parkingLotRepository;

    public ParkingLotRepositoryTest(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Test
    void givenAParkingLot_ThenCreateParkingLot(){
      /* Category category=new Category("underground");
        ParkingLot parkingLot=ParkingLot.ParkingLotBuilder.parkingLotBuilder().withName("aParkingLot")
                .withCategory(category).withMaxCapacity(100).withContactPerson(new Person("Bob"))
                .withAddress(new Address("streetname","streetnumber",new PostCode("Bruxelles","1180"))).withPricePerHour(new BigDecimal("5.5")).build();



        Assertions.assertThat(parkingLotRepository.save(parkingLot)).isEqualTo(parkingLot);*/
    }
}