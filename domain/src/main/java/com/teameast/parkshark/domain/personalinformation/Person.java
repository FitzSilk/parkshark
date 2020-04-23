package com.teameast.parkshark.domain.personalinformation;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID person_id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;


    @Column(name = "email")
    private String email;

    /* @ManyToOne
     @JoinColumn (name="address_id")*/
    @Transient
    private Address address;

    /*@JoinColumn(name ="phone_id")
    @Nullable*/
    @Transient
    private Integer fixPhoneNumber;

    /*@JoinColumn(name = "phone_id")
    @Nullable*/
    @Transient
    private Integer mobilePhoneNumber;

    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }


    protected String getFirstName() {
        return firstName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(person_id, person.person_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person_id);
    }
}
