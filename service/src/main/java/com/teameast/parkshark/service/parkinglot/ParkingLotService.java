package com.teameast.parkshark.service.parkinglot;

import com.teameast.parkshark.domain.parkinglots.ParkingLot;
import com.teameast.parkshark.domain.parkinglots.ParkingLotRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingLotMapper parkingLotMapper;

    public ParkingLotDto create (ParkingLotDto parkingLotDto){
        parkingLotRepository.save(parkingLotMapper.parkingLotDtoToParkingLot(parkingLotDto));
        return parkingLotDto;
    }

    public List<ParkingLotDto> getAllParkingLot(){
        return parkingLotRepository.getAllParkingLot().stream().map(p->parkingLotMapper.parkingLotToDto(p)).collect(Collectors.toList());
    }


}
