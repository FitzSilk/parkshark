package com.teameast.parkshark.domain.division;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DivisionRepository extends CrudRepository<Division, Integer> {

    Division save(Division newDivision);

    Collection<Division> findAll();

}
