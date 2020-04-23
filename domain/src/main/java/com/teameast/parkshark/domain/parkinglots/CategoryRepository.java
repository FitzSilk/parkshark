package com.teameast.parkshark.domain.parkinglots;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

    //?1 is to get the first parameter here myCategory

    @Query("Select c from Category c Where c.category=?1")
    Category findByNameOfCategory(String myCategory);
}
