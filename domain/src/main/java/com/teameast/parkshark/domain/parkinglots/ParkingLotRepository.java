package com.teameast.parkshark.domain.parkinglots;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;


@Repository
public class ParkingLotRepository {
    @PersistenceContext
    EntityManager entityManager;


    public void save(ParkingLot parkingLot){
        entityManager.persist(parkingLot);
    }

    public List<ParkingLot> getAllParkingLot(){
       return entityManager.createQuery("select p from ParkingLot p",ParkingLot.class).getResultList();
    }
}
