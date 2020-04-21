package com.teameast.parkshark.domain.parkinglots;

import com.teameast.parkshark.domain.personalinformation.Person;
import com.teameast.parkshark.domain.personalinformation.Address;
import com.teameast.parkshark.domain.personalinformation.PostCode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.teameast.parkshark.domain.parkinglots.ParkingLot.ParkingLotBuilder.parkingLotBuilder;

class ParkingLotTest {
    @Test
    void whenCreatingParkingLot_ParkingExist() {
        Category category=new Category();
        //GIVEN
        ParkingLot parkingLot = parkingLotBuilder()
                .withName("OurParkingLotBuilder")
                .withCategory(category)
                .withMaxCapacity(100)
                .withAddress(new Address("Avenue Paul Hymans", "71", new PostCode("Woluwe Saint Lambert)", "1200")))
                .withContactPerson(new Person())
                .withPricePerHour(5.5)
                .build();
        //THEN
        Assertions.assertThat(parkingLot).isNotNull();
        Assertions.assertThat(parkingLot.getName()).isEqualTo("OurParkingLotBuilder");


    }

    @Test
    void whenNotInsertingName_ThrowsError() {
        Category category=new Category();
        Assertions.assertThatThrownBy(() -> parkingLotBuilder()
                .withCategory(category)
                .withMaxCapacity(100)
                .withAddress(new Address("Avenue Paul Hymans", "71", new PostCode("Woluwe Saint Lambert)", "1200")))
                .withContactPerson(new Person())
                .withPricePerHour(5.5)
                .build()).isInstanceOf(IllegalArgumentException.class);
    }
}