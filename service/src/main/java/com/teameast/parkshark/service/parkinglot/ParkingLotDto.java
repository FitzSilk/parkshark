package com.teameast.parkshark.service.parkinglot;

import com.teameast.parkshark.domain.parkinglots.Category;
import com.teameast.parkshark.domain.personalinformation.Address;
import com.teameast.parkshark.domain.personalinformation.Person;


public class ParkingLotDto {

    private int id;
    private String name;
    private Category category;
    private int maxCapacity;
    private Person contactPerson;
    private Address address;
    private double pricePerHour;

    public ParkingLotDto(int id, String name, Category category, int maxCapacity, Person contactPerson, Address address, double pricePerHour) {
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

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public Address getAddress() {
        return address;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }
}
