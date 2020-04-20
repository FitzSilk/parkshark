package com.teameast.parkshark.domain.personalinformation;

public class PostCode {
    private String city;
    private String zipCode;

    public PostCode(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "PostCode{" +
                "city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
