package com.teameast.parkshark.domain.personalinformation;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name="PERSON")
public class Person {
    @Id
    private UUID person_id;

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

    @JoinColumn(name ="phone_id")
    @Nullable
    private Integer fixPhoneNumber;

    @JoinColumn(name = "phone_id")
    @Nullable
    private Integer mobilePhoneNumber;

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
        return person_id.toString();
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }
}
