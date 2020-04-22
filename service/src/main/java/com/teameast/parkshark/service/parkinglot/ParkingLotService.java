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

    public ParkingLotService(ParkingLotRepository parkingLotRepository, ParkingLotMapper parkingLotMapper) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingLotMapper = parkingLotMapper;
    }

    public ParkingLotDto create (ParkingLotDto parkingLotDto){
        //CategoryRepository.save(parkingLotDto.getCategory());
        return parkingLotMapper.parkingLotToDto(parkingLotRepository.save(parkingLotMapper.parkingLotDtoToParkingLot(parkingLotDto)));

    }

    public List<ParkingLotDto> getAllParkingLot(){
        return parkingLotRepository.findAll()
                .stream()
                .map(p->parkingLotMapper.parkingLotToDto(p))
                .collect(Collectors.toList());
    }


}
