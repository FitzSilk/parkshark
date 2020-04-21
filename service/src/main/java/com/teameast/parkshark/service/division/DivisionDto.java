package com.teameast.parkshark.service.division;

public class DivisionDto {

    private String name;
    private String originalName;
    private String director;

    public DivisionDto(String name, String originalName, String director) {
        this.name = name;
        this.originalName = originalName;
        this.director = director;
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
