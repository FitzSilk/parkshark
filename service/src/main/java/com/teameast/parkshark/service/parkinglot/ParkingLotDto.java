package com.teameast.parkshark.service.parkinglot;

import com.teameast.parkshark.domain.parkinglots.Category;
import com.teameast.parkshark.domain.personalinformation.Address;
import com.teameast.parkshark.domain.personalinformation.Person;

import java.math.BigDecimal;


public class ParkingLotDto {

    private int id;
    private String name;
    private Category category;
    private Integer maxCapacity;
    private Person contactPerson;
    private Address address;
    private BigDecimal pricePerHour;

    public ParkingLotDto(){

    }

    public ParkingLotDto(int id, String name, Integer maxCapacity, Category category,BigDecimal pricePerHour) {
        this.id = id;
        this.name = name;
        this.maxCapacity=maxCapacity;
        this.category=category;
        this.pricePerHour=pricePerHour;
    }

    public ParkingLotDto(String name, Category category, Integer maxCapacity, Person contactPerson, Address address, BigDecimal pricePerHour){
        this.name = name;
        this.category = category;
        this.maxCapacity = maxCapacity;
        this.contactPerson = contactPerson;
        this.address = address;
        this.pricePerHour = pricePerHour;
    }

    public ParkingLotDto(int id, String name, Category category, Integer maxCapacity, Person contactPerson, Address address, BigDecimal pricePerHour) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.maxCapacity = maxCapacity;
        this.contactPerson = contactPerson;
        this.address = address;
        this.pricePerHour = pricePerHour;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public Address getAddress() {
        return address;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public void setCategory(Category category) {
        this.category=category;
    }
}
