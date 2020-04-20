package com.teameast.parkshark.domain.personalinformation;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table (name="parking_address")
public class Address {
    @Id
    private int id;

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

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
