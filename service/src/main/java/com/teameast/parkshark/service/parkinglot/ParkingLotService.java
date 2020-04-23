package com.teameast.parkshark.service.parkinglot;

import com.teameast.parkshark.domain.parkinglots.Category;
import com.teameast.parkshark.domain.parkinglots.CategoryRepository;
import com.teameast.parkshark.domain.parkinglots.ParkingLotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class ParkingLotService {
    private final ParkingLotRepository parkingLotRepository;
    private final ParkingLotMapper parkingLotMapper;
    private final CategoryRepository categoryRepository;


    public ParkingLotService(ParkingLotRepository parkingLotRepository, ParkingLotMapper parkingLotMapper, CategoryRepository categoryRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingLotMapper = parkingLotMapper;
        this.categoryRepository = categoryRepository;

    }

    public ParkingLotDto create(ParkingLotDto parkingLotDto) {

        Category category = categoryRepository.findByNameOfCategory(parkingLotDto.getCategory().getCategory());

        if (category == null) {
            throw new IllegalArgumentException("Put something right, you moron !");
        }

        parkingLotDto.setCategory(category);
        return parkingLotMapper.parkingLotToDto(parkingLotRepository.save(parkingLotMapper.parkingLotDtoToParkingLot(parkingLotDto)));
    }

    public List<ParkingLotDto> getAllParkingLot() {
        return parkingLotRepository.findAll()
                .stream()
                .map(p -> parkingLotMapper.parkingLotToDto(p))
                .collect(Collectors.toList());
    }


}
