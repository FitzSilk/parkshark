package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.features.RoleType;

import java.time.LocalDate;

public class UserDto {

    private int member_id;
    private String firstName;
    private String lastName;
    private int licencePlate;
    private String email;
    private int address;
    private String password;
    private LocalDate registrationDate;
    private int phoneNumber;
    private RoleType roleType;

    public UserDto() {
    }

    public UserDto(UserDtoBuilder userDtoBuilder) {
        this.firstName = userDtoBuilder.getFirstName();
        this.lastName = userDtoBuilder.getLastName();
        this.licencePlate = userDtoBuilder.getLicencePlate();
        this.email = userDtoBuilder.getEmail();
        this.address = userDtoBuilder.getAddress();
        this.registrationDate = userDtoBuilder.getRegistrationDate();
        this.phoneNumber = userDtoBuilder.getPhoneNumber();
    }

    public int getMember_id() {
        return member_id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getLicencePlate() {
        return licencePlate;
    }

    public int getAddress() {
        return address;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public RoleType getRoleType() {
        return roleType;
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

    public static class UserDtoBuilder {

        private int id;
        private String firstName;
        private String lastName;
        private int licencePlate;
        private String email;
        private int phoneNumber;
        private LocalDate registrationDate;
        private int address;

        protected UserDtoBuilder() {

        }

        public static UserDtoBuilder userDtoBuilder() {
            return new UserDtoBuilder();
        }

        public UserDto build() {
            return new UserDto(this);
        }

        public UserDtoBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public UserDtoBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDtoBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDtoBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserDtoBuilder withLicencePlate(int licencePlate) {
            this.licencePlate = licencePlate;
            return this;
        }

        public UserDtoBuilder withAddress(int id) {
            this.address = id;
            return this;
        }

        public UserDtoBuilder withPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserDtoBuilder withRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getLicencePlate() {
            return licencePlate;
        }

        public String getEmail() {
            return email;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public LocalDate getRegistrationDate() {
            return registrationDate;
        }

        public int getAddress() {
            return address;
        }
    }
}

