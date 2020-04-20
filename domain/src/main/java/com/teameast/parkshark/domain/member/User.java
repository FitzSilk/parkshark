package com.teameast.parkshark.domain.member;

import com.teameast.parkshark.domain.member.features.RoleType;

public class User extends Person {
    private RoleType roleType;

    public User() {
    }

    public String getId() {
        return super.getId();
    }

    public String getFirstName() {
        return super.getFirstName();
    }

    public String getPassword() {
        return super.getPassword();
    }

    public Object getRole() {
        return roleType;
    }

    public String getEmail() {
        return super.getEmail();
    }
}
