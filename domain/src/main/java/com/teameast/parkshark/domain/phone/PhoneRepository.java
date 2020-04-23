package com.teameast.parkshark.domain.phone;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends CrudRepository<PhoneNumber, Integer> {

    PhoneNumber save(PhoneNumber phoneNumber);

    List<PhoneNumber> findAll();

    @Query("SELECT b.phone_id FROM PhoneNumber b WHERE (b.phoneNumber = 'phoneNumber')")
    Integer findByValue(String phoneNumber);

}
