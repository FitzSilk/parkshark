package com.teameast.parkshark.service.parkinglot;


public class CategoryDto {

    private Integer id;
    private String category;

    public CategoryDto(){}

    public CategoryDto(String category) {
        this.category=category;
    }

    public Integer getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
}
