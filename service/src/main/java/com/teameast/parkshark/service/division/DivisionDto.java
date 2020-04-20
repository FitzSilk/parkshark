package com.teameast.parkshark.service.division;

import com.teameast.parkshark.domain.Person;

public class DivisionDto {

    private int id;
    private String name;
    private String originalName;
    private Person director;

    public DivisionDto(int id, String name, String originalName, Person director) {
        this.id = id;
        this.name = name;
        this.originalName = originalName;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public Person getDirector() {
        return director;
    }
}
