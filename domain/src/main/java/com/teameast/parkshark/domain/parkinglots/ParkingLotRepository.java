package com.teameast.parkshark.domain.parkinglots;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;


@Repository
public interface ParkingLotRepository extends CrudRepository<ParkingLot,Integer> {

     ParkingLot save(ParkingLot parkingLot);

    List<ParkingLot> getAll();
}
