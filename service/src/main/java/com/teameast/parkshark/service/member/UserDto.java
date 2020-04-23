package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.MemberAddress;
import com.teameast.parkshark.domain.member.features.RoleType;
import com.teameast.parkshark.domain.phone.PhoneNumber;

import java.time.LocalDate;
import java.util.UUID;

public class UserDto {

    private UUID member_id;
    private String firstName;
    private String lastName;
    private int licencePlate;
    private String email;
    private MemberAddress address;
    private LocalDate registrationDate;
    private PhoneNumber phoneNumber;

    public UserDto() {
    }

    public UserDto(UserDtoBuilder userDtoBuilder) {
        this.member_id = userDtoBuilder.getId();
        this.firstName = userDtoBuilder.getFirstName();
        this.lastName = userDtoBuilder.getLastName();
        this.licencePlate = userDtoBuilder.getLicencePlate();
        this.email = userDtoBuilder.getEmail();
        this.address = userDtoBuilder.getAddress();
        this.registrationDate = userDtoBuilder.getRegistrationDate();
        this.phoneNumber = userDtoBuilder.getPhoneNumber();
    }

    public UUID getMember_id() {
        return member_id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getLicencePlate() {
        return licencePlate;
    }

    public MemberAddress getAddress() {
        return address;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "member_id=" + member_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", licencePlate=" + licencePlate +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", registrationDate=" + registrationDate +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public static class UserDtoBuilder {

        private UUID id;
        private String firstName;
        private String lastName;
        private int licencePlate;
        private String licencePlateCountry;
        private String email;
        private PhoneNumber phoneNumber;
        private LocalDate registrationDate;
        private MemberAddress address;

        protected UserDtoBuilder() {

        }

        public static UserDtoBuilder userDtoBuilder() {
            return new UserDtoBuilder();
        }

        public UserDto build() {
            return new UserDto(this);
        }

        public UserDtoBuilder withId(UUID id) {
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

        public UserDtoBuilder withLicencePlateCountry(String licencePlateCountry) {
            this.licencePlateCountry = licencePlateCountry;
            return this;
        }

        public UserDtoBuilder withAddress(MemberAddress memberAddress) {
            this.address = memberAddress;
            return this;
        }

        public UserDtoBuilder withPhoneNumber(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserDtoBuilder withRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public UUID getId() {
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

        public PhoneNumber getPhoneNumber() {
            return phoneNumber;
        }

        public LocalDate getRegistrationDate() {
            return registrationDate;
        }

        public MemberAddress getAddress() {
            return address;
        }

        public String getLicencePlateCountry() {
            return licencePlateCountry;
        }
    }
}

