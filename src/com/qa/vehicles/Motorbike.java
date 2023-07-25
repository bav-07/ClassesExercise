package com.qa.vehicles;

public class Motorbike extends Vehicle {

    private boolean hasSidecar;

    public Motorbike(int id, int noOfWheels, int noOfSeats, int enginePower, boolean electric, String make, String model, String fuelType, String colour, boolean hasSidecar) {
        super(id, noOfWheels, noOfSeats, enginePower, electric, make, model, fuelType, colour);
        this.hasSidecar = hasSidecar;
    }

    public Motorbike(boolean hasSidecar) {
        super();
        this.hasSidecar = hasSidecar;
    }

    public void doWheelie(){
        System.out.println("Wheee!");
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
