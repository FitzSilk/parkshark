package com.teameast.parkshark.api;

import com.teameast.parkshark.service.parkinglot.ParkingLotDto;
import com.teameast.parkshark.service.parkinglot.ParkingLotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ParkingLotController.PARKINGLOT_RESOURCE_PATH)

public class ParkingLotController {
    public static final String PARKINGLOT_RESOURCE_PATH = "/parkinglots";
    private final Logger myLogger = LoggerFactory.getLogger(ParkingLotController.class);
    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @GetMapping(produces = "application/json")
    public List<ParkingLotDto> getAllParkingLot() {
        myLogger.info("someone visited this page");

        return parkingLotService.getAllParkingLot();

    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ParkingLotDto createParkingLot(@RequestBody ParkingLotDto parkingLotDto) {
        myLogger.info("someone added a parking lot");

        return parkingLotService.create(parkingLotDto);
    }


}
