package com.teameast.parkshark.domain.phone;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

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

    public int getPhone_id() {
        return phone_id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
}
