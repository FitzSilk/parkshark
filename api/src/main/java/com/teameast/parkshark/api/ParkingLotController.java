package com.teameast.parkshark.api;

import com.teameast.parkshark.service.parkinglot.ParkingLotDto;
import com.teameast.parkshark.service.parkinglot.ParkingLotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/parkingLot")

public class ParkingLotController {
    private final Logger myLogger = LoggerFactory.getLogger(ParkingLotController.class);
    private ParkingLotService parkingLotService;

    @GetMapping(produces = "application/json")
    public String getAllParkingLot() {
        myLogger.info("someone visited this page");

        return "hello";
    }

    @PostMapping(produces ="application/json", consumes="application/json")
    public ParkingLotDto createParkingLot(@RequestBody ParkingLotDto parkingLotDto){

        return parkingLotDto;
    }
}
