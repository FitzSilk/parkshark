package com.teameast.parkshark.domain.member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    Collection<User> findAll();
}
