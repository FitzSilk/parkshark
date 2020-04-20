package com.teameast.parkshark.domain.parkinglots;

import com.teameast.parkshark.domain.personalinformation.Person;
import com.teameast.parkshark.domain.personalinformation.Address;
import org.springframework.jca.cci.CannotGetCciConnectionException;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table(name="parking_lot")
public class ParkingLot {

    @Id
    private int id;

    @Column (name="pl_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @Column (name="max_capacity")
    private int maxCapacity;

    @ManyToOne
    @JoinColumn(name="contact_person_id")
    private Person contactPerson;

    @ManyToOne
    @JoinColumn(name="address_id")
    private Address address;

    @Column (name="price_hour")
    private double pricePerHour;

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

    public double getPricePerHour() {
        return pricePerHour;
    }

    public static class ParkingLotBuilder {
        private String name;
        private Category category;
        private int maxCapacity;
        private Person contactPerson;
        private Address address;
        private double pricePerHour;

        public static ParkingLotBuilder parkingLotBuilder() {
            return new ParkingLotBuilder();
        }

        public ParkingLotBuilder() {
        }

        private void checkForNulls(ParkingLotBuilder parkingLotBuilder) {
            if(parkingLotBuilder.name==null || parkingLotBuilder.category==null || parkingLotBuilder.maxCapacity==0|| parkingLotBuilder.contactPerson==null ||parkingLotBuilder.address==null || parkingLotBuilder.pricePerHour==0){
                throw new IllegalArgumentException("Put in something you moron!!!");
            }
        }

        public ParkingLot build(){
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
        public ParkingLotBuilder withPricePerHour(double pricePerHour){
            this.pricePerHour=pricePerHour;
            return this;
        }


    }


}