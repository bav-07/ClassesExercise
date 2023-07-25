package com.qa.vehicles;

public class Vehicle {

    private int id;
    private int noOfWheels;
    private int noOfSeats;
    private int enginePower;
    private boolean electric;
    private String make;
    private String model;
    private String fuelType;
    private String colour;

    public Vehicle(int id, int noOfWheels, int noOfSeats, int enginePower, boolean electric, String make, String model, String fuelType, String colour) {
        this.id = id;
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
        this.enginePower = enginePower;
        this.electric = electric;
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.colour = colour;
    }

    public Vehicle() {
        super();
    }

    public void go() {
        System.out.println("Vroom");
    }

    public void stop() {
        System.out.println("Scrrrcch");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
