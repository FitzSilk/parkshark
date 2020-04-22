package com.teameast.parkshark.domain.phone;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class PhoneNumber {

    @Id
    private int phone_id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Autowired
    public PhoneNumber() {
    }
}
