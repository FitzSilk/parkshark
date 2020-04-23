package com.teameast.parkshark.domain.parkinglots;

import com.teameast.parkshark.domain.personalinformation.Address;
import com.teameast.parkshark.domain.personalinformation.Person;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "parking_lot")
public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pl_id;

    @Column(name = "pl_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "max_capacity")
    private Integer maxCapacity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_person_id", referencedColumnName = "person_id")
    private Person contactPerson;

    /*@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="address_id")*/
    @Transient
    private Address address;

    @Column(name = "price_hour")
    private BigDecimal pricePerHour;

    public ParkingLot() {
    }

    public ParkingLot(ParkingLotBuilder parkingLotBuilder) {
        name = parkingLotBuilder.name;
        category = parkingLotBuilder.category;
        maxCapacity = parkingLotBuilder.maxCapacity;
        contactPerson = parkingLotBuilder.contactPerson;
        /*address = parkingLotBuilder.address;*/
        pricePerHour = parkingLotBuilder.pricePerHour;
    }

    public int getId() {
        return pl_id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public Address getAddress() {
        return address;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public static class ParkingLotBuilder {
        private String name;
        private Category category;
        private Integer maxCapacity;
        private Person contactPerson;
        private Address address;
        private BigDecimal pricePerHour;

        public static ParkingLotBuilder parkingLotBuilder() {
            return new ParkingLotBuilder();
        }

        public ParkingLotBuilder() {
        }

        private void checkForNulls(ParkingLotBuilder parkingLotBuilder) {
            if (parkingLotBuilder.name == null || parkingLotBuilder.category == null || parkingLotBuilder.maxCapacity == 0 || parkingLotBuilder.contactPerson == null || parkingLotBuilder.pricePerHour == null) {
                throw new IllegalArgumentException("Put in something you moron!!!");
            }
        }

        public ParkingLot build() {
            checkForNulls(this);
            return new ParkingLot(this);
        }

        public ParkingLotBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ParkingLotBuilder withCategory(Category category) {
            this.category = category;
            return this;
        }

        public ParkingLotBuilder withMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public ParkingLotBuilder withContactPerson(Person contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }

        public ParkingLotBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public ParkingLotBuilder withPricePerHour(BigDecimal pricePerHour) {
            this.pricePerHour = pricePerHour;
            return this;
        }


    }


}