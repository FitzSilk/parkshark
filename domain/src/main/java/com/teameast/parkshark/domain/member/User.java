package com.teameast.parkshark.domain.member;

import com.teameast.parkshark.domain.member.features.RoleType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="members")
public class User {

    @Id
    private int member_id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "licence_plate")
    private int licence_plate;

    @Column(name = "email")
    private String email;

    @Column(name = "address_id")
    private int address;

    @Transient
    private String password;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @JoinColumn(name = "phone_id")
    private int phoneNumber;

    private RoleType roleType;

    public User() {
    }

    public int getId() {
        return member_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public Object getRole() {
        return roleType;
    }

    public String getEmail() {
        return email;
    }
}

