package com.teameast.parkshark.domain.division;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class DivisionRepository {

    private ConcurrentHashMap<Integer, Division> divisionRepository;

    @Autowired
    public DivisionRepository() {
        this.divisionRepository = new ConcurrentHashMap<>();
    }

    public Division save(Division newDivision) {
        divisionRepository.put(newDivision.getId(), newDivision);
        return newDivision;
    }

    public Collection<Division> getAllDivisions() {
        return divisionRepository.values();
    }
}
