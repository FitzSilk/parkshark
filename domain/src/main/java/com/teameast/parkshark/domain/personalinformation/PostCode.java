package com.teameast.parkshark.domain.personalinformation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zip")
public class PostCode {
    @Id
    private String zipCode;

    @Column(name = "city")
    private String city;

    public PostCode(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public PostCode() {
    }

    @Override
    public String toString() {
        return "PostCode{" +
                "city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
