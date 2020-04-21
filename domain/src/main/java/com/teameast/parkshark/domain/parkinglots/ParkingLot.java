package com.teameast.parkshark.domain.parkinglots;

import com.teameast.parkshark.domain.personalinformation.Person;
import com.teameast.parkshark.domain.personalinformation.Address;
import org.springframework.jca.cci.CannotGetCciConnectionException;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="parking_lot")
public class ParkingLot {

    @Id
    private int pl_id;

    @Column (name="pl_name")
    private String name;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="category_id")
    private Category category;

    @Column (name="max_capacity")
    private int maxCapacity;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contact_person_id")
    private Person contactPerson;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

    @Column (name="price_hour")
    private BigDecimal pricePerHour;

    public ParkingLot(){}

    public ParkingLot(ParkingLotBuilder parkingLotBuilder) {
        name = parkingLotBuilder.name;
        category = parkingLotBuilder.category;
        maxCapacity = parkingLotBuilder.maxCapacity;
        contactPerson = parkingLotBuilder.contactPerson;
        address = parkingLotBuilder.address;
        pricePerHour = parkingLotBuilder.pricePerHour;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", contactPerson=" + contactPerson +
                ", address=" + address +
                ", pricePerHour=" + pricePerHour +
                '}';
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

    public int getMaxCapacity() {
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
        private int maxCapacity;
        private Person contactPerson;
        private Address address;
        private BigDecimal pricePerHour;

        public static ParkingLotBuilder parkingLotBuilder() {
            return new ParkingLotBuilder();
        }

        public ParkingLotBuilder() {
        }

        private void checkForNulls(ParkingLotBuilder parkingLotBuilder) {
            if(parkingLotBuilder.name==null || parkingLotBuilder.category==null || parkingLotBuilder.maxCapacity==0|| parkingLotBuilder.contactPerson==null ||parkingLotBuilder.address==null || parkingLotBuilder.pricePerHour==null){
                throw new IllegalArgumentException("Put in something you moron!!!");
            }
        }

        public ParkingLot build(){
            //checkForNulls(this);
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

        public ParkingLotBuilder withMaxCapacity(int maxCapacity){
            this.maxCapacity=maxCapacity;
            return this;
        }
        public ParkingLotBuilder withContactPerson (Person contactPerson){
            this.contactPerson=contactPerson;
            return this;
        }
        public ParkingLotBuilder withAddress (Address address){
            this.address=address;
            return this;
        }
        public ParkingLotBuilder withPricePerHour(BigDecimal pricePerHour){
            this.pricePerHour=pricePerHour;
            return this;
        }


    }


}