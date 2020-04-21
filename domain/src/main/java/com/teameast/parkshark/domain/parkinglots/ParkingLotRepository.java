package com.teameast.parkshark.domain.parkinglots;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingLotRepository extends CrudRepository<ParkingLot, Integer> {


    List<ParkingLot> findAll();
}
