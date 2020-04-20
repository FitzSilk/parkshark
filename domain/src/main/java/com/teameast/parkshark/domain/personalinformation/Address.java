package com.teameast.parkshark.domain.personalinformation;

public class Address {
    private String streetName;
    private String streetNumber;
    private PostCode postCode;

    public Address(String streetName, String streetNumber, PostCode postCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
