package com.teameast.parkshark.domain.member;

import com.teameast.parkshark.domain.member.features.RoleType;
import com.teameast.parkshark.domain.phone.PhoneNumber;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="members")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int member_id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "licence_plate")
    private int licencePlate;

    @Column(name = "licence_plate_country")
    private String licencePlateCountry;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private MemberAddress address;

    @Transient
    private String password;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @OneToOne
    @JoinColumn(name = "phone_id")
    private PhoneNumber phoneNumber;

    @Transient
    private RoleType roleType;

    public User() {
    }

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.getFirstName();
        this.lastName = userBuilder.getLastName();
        this.licencePlate = userBuilder.getLicencePlate();
        this.licencePlateCountry = userBuilder.getLicencePlateCountry();
        this.email = userBuilder.getEmail();
        this.address = userBuilder.getAddress();
        this.registrationDate = userBuilder.getRegistrationDate();
        this.phoneNumber = userBuilder.getPhoneNumber();
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

    public String getLastName() {
        return lastName;
    }

    public MemberAddress getAddress() {
        return address;
    }

    public int getLicencePlate() {
        return licencePlate;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getLicencePlateCountry() {
        return licencePlateCountry;
    }

    public static class UserBuilder {

        private int id;
        private String firstName;
        private String lastName;
        private int licencePlate;
        private String email;
        private PhoneNumber phoneNumber;
        private LocalDate registrationDate;
        private MemberAddress address;
        private String licencePlateCountry;

        protected UserBuilder() {

        }

        public static UserBuilder userBuilder() {
            return new UserBuilder();
        }

        public User build() {
            return new User(this);
        }

        public UserBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withLicencePlate(int licencePlate) {
            this.licencePlate = licencePlate;
            return this;
        }

        public UserBuilder withAddress(MemberAddress memberAddress) {
            this.address = memberAddress;
            return this;
        }

        public UserBuilder withPhoneNumber(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder withRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public UserBuilder withLicencePlateCountry(String licencePlateCountry) {
            this.licencePlateCountry = licencePlateCountry;
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

