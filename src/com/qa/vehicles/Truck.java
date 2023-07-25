package com.qa.vehicles;

public class Truck extends Vehicle {

    private int noOfDoors;
    private int deliverySize;
    private boolean trailerAttached;

    public Truck(int id, int noOfWheels, int noOfSeats, int enginePower, boolean electric, String make, String model, String fuelType, String colour, int noOfDoors, int deliverySize, boolean trailerAttached) {
        super(id, noOfWheels, noOfSeats, enginePower, electric, make, model, fuelType, colour);
        this.noOfDoors = noOfDoors;
        this.deliverySize = deliverySize;
        this.trailerAttached = trailerAttached;
    }

    public Truck(int noOfDoors, int deliverySize, boolean trailerAttached) {
        super();
        this.noOfDoors = noOfDoors;
        this.deliverySize = deliverySize;
        this.trailerAttached = trailerAttached;
    }

    public boolean toggleTrailer() {
        return this.trailerAttached = !trailerAttached;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getDeliverySize() {
        return deliverySize;
    }

    public void setDeliverySize(int deliverySize) {
        this.deliverySize = deliverySize;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }
}
