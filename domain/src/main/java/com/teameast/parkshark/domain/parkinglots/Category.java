package com.teameast.parkshark.domain.parkinglots;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    private int id;

    @Column(name="category")
    private String category;
}
