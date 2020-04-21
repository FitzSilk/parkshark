package com.teameast.parkshark.service.division;

import com.teameast.parkshark.domain.personalinformation.Person;

public class DivisionDto {

    private int id;
    private String name;
    private String originalName;
    private String director;

    public DivisionDto(int id, String name, String originalName, String director) {
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

    public String getDirector() {
        return director;
    }
}
