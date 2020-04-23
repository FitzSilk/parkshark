package com.teameast.parkshark.domain.member;

import javax.persistence.*;

@Entity
@Table(name = "person_address")
public class MemberAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int person_address_id;

    @Column(name = "person_street")
    private String streetName;

    @Column(name = "person_nr")
    private String streetNumber;

    @Column(name = "postal_code")
    private String postalCode;

    public MemberAddress() {
    }

    public MemberAddress(String streetName, String streetNumber, String postalCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    public int getPerson_address_id() {
        return person_address_id;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
