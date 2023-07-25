package com.qa.vehicles;

public class Car extends Vehicle {

    private int bootSize;
    private int noOfDoors;

    public Car(int id, int noOfWheels, int noOfSeats, int enginePower, boolean electric, String make, String model, String fuelType, String colour, int bootSize, int noOfDoors) {
        super(id, noOfWheels, noOfSeats, enginePower, electric, make, model, fuelType, colour);
        this.bootSize = bootSize;
        this.noOfDoors = noOfDoors;
    }

    public Car(int bootSize, int noOfDoors) {
        super();
        this.bootSize = bootSize;
        this.noOfDoors = noOfDoors;
    }

    public void openDoors() {
        System.out.println("Doors opening");
    }

    public int getBootSize() {
        return bootSize;
    }

    public void setBootSize(int bootSize) {
        this.bootSize = bootSize;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
}
