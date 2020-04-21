package com.teameast.parkshark.domain.personalinformation;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name="person")
public class Person {
    @Id
    private String id;

    @Column(name="firstname")
    private String firstName;

    @Column (name="lastname")
    private String lastName;

    @Transient
    private String password;

    @Column (name="email")
    private String email;

    @ManyToOne
    @JoinColumn (name="address_id")
    private Address address;

    public Person(){}

    public Person(String firstName){
        this.firstName=firstName;
    }
    protected String getFirstName() {
        return firstName;
    }

    protected String getPassword() {
        return password;
    }

    protected String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }
}
