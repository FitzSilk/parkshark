package com.teameast.parkshark.domain.member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberAddressRepository extends CrudRepository<MemberAddress, Integer> {

}
