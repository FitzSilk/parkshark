package com.teameast.parkshark.domain.member;

import java.util.UUID;

public class Person {

    private String firstName;
    private String password;
    private String email;
    private String id;

    public Person() {
        this.id = UUID.randomUUID().toString();
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
}
