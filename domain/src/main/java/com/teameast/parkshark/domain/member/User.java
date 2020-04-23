package com.teameast.parkshark.domain.member;

import com.teameast.parkshark.domain.personalinformation.Person;
import com.teameast.parkshark.domain.member.features.RoleType;

public class User extends Person {
    private RoleType roleType;
    private String password="abc";

    public User() {
    }

    public String getId() {
        return super.getId();
    }

    public String getFirstName() {
        return super.getFirstName();
    }

    public String getPassword() {
        return password;
    }

    public Object getRole() {
        return roleType;
    }

    public String getEmail() {
        return super.getEmail();
    }
}
