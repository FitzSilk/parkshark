package com.teameast.parkshark.service.parkinglot;

import com.teameast.parkshark.domain.parkinglots.ParkingLot;
import org.springframework.stereotype.Component;

@Component
public class ParkingLotMapper {


    public ParkingLotMapper() {

    }

    public ParkingLotDto parkingLotToDto(ParkingLot parkingLot) {

        return new ParkingLotDto(parkingLot.getId(),
                parkingLot.getName(),
                parkingLot.getCategory(),
                parkingLot.getMaxCapacity(),
                parkingLot.getContactPerson(),
                parkingLot.getAddress(),
                parkingLot.getPricePerHour()
        );
    }


    public ParkingLot parkingLotDtoToParkingLot(ParkingLotDto parkingLotDto) {
        return ParkingLot
                .ParkingLotBuilder
                .parkingLotBuilder()
                .withName(parkingLotDto.getName())
                .withCategory(parkingLotDto.getCategory())
                .withMaxCapacity(parkingLotDto.getMaxCapacity())
                .withContactPerson(parkingLotDto.getContactPerson())
                .withAddress(parkingLotDto.getAddress())
                .withPricePerHour(parkingLotDto.getPricePerHour())
                .build();

    }

}
