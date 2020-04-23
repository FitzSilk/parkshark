package com.teameast.parkshark.domain.personalinformation;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table (name="parking_address")
public class Address {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int parking_address_id;

    @Column (name="parking_street")
    private String streetName;

    @Column (name="parking_nr")
    private String streetNumber;

    @ManyToOne
    @JoinColumn (name="postal_code")
    private PostCode postCode;

    public Address(String streetName, String streetNumber, PostCode postCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
    }
    public Address(){}

    public int getParking_address_id() {
        return parking_address_id;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public PostCode getPostCode() {
        return postCode;
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
