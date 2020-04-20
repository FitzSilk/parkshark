package com.teameast.parkshark.domain.parkinglots;

import com.teameast.parkshark.domain.member.Person;
import com.teameast.parkshark.domain.personalinformation.Address;

public class ParkingLot {
    private String name;
    private String category;
    private int maxCapacity;
    private Person contactPerson;
    private Address address;
    private double pricePerHour;

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

    public String getCategory() {
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
        private String category;
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

        public ParkingLotBuilder withCategory(String category) {
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