package com.teameast.parkshark.domain.parkinglots;

import com.teameast.parkshark.domain.personalinformation.Address;
import com.teameast.parkshark.domain.personalinformation.Person;
import com.teameast.parkshark.domain.personalinformation.PostCode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

class ParkingLotRepositoryTest {

    @Test
    void givenAParkingLot_ThenCreateParkingLot(){
        Category category=new Category("underground");
        ParkingLot parkingLot=ParkingLot.ParkingLotBuilder.parkingLotBuilder().withName("aParkingLot")
                .withCategory(category).withMaxCapacity(100).withContactPerson(new Person("Bob"))
                .withAddress(new Address("streetname","streetnumber",new PostCode("Bruxelles","1180"))).withPricePerHour(5.5).build();

        ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
        parkingLotRepository.save(parkingLot);

        List<ParkingLot> parkingLots=parkingLotRepository.getAllParkingLot();

        Assertions.assertThat(parkingLots).contains(parkingLot);
    }
}