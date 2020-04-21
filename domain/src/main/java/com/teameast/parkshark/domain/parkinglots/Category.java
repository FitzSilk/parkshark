package com.teameast.parkshark.domain.parkinglots;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    private int category_id;

    @Column(name="category")
    private String category;

    public Category(){

    }

    public Category(String name) {
        this.category=name;
    }
}
