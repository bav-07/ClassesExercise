package com.qa.vehicles;

import java.util.*;
import java.util.stream.Collectors;

public class Garage {

    List<Vehicle> storage = new ArrayList<>();

    public Garage(List<Vehicle> storage) {
        this.storage = storage;
    }

    public Garage() {
        super();
    }

    public boolean addVehicle(Vehicle vehicle) {
        return this.storage.add(vehicle);
    }

    public boolean removeVehicle(int id) {
        Vehicle toRemove = storage.stream().filter(vehicle -> vehicle.getId() == (id)).findAny().orElse(null);
        if (toRemove != null) {
            System.out.println("Vehicle ID " + toRemove.getId() + " has been removed. Goodbye " + toRemove.getMake() + " " + toRemove.getModel() + "!");
            return storage.remove(toRemove);
        } else {
            System.out.println("No vehicle found with id provided.");
        }
        return false;
    }

    public int fixVehicle(int id) {
        Vehicle toFix = storage.stream().filter(vehicle -> vehicle.getId() == (id)).findAny().orElse(null);
        if (toFix instanceof Car) {
            return calculateVehicleBill((Car) toFix);
        } else if (toFix instanceof Motorbike) {
            return calculateVehicleBill((Motorbike) toFix);
        } else if (toFix instanceof Truck) {
            return calculateVehicleBill((Truck) toFix);
        } else {
            System.out.println("ID " + toFix.getId() + ": Unrecognized vehicle: bill will not be calculated for");
            return 0;
        }
    }

    public int calculateVehicleBill(Car car) {
        int bill = car.getEnginePower() * car.getNoOfSeats() * car.getNoOfDoors() + car.getBootSize() * 5;
        System.out.println("ID " + car.getId() + ": The bill for this " + car.getMake() + " " + car.getModel() + " is £" + bill);
        return bill;
    }

    public int calculateVehicleBill(Motorbike motorbike) {
        int bill = motorbike.getEnginePower() * motorbike.getNoOfSeats() + (motorbike.isHasSidecar() ? 1500 : 0);
        System.out.println("ID " + motorbike.getId() + ": The bill for this " + motorbike.getMake() + " " + motorbike.getModel() + " is £" + bill);
        return bill;
    }

    public int calculateVehicleBill(Truck truck) {
        int bill = truck.getEnginePower() * truck.getDeliverySize() / 100 + (truck.isTrailerAttached() ? 3000 : 0);
        System.out.println("ID " + truck.getId() + ": The bill for this " + truck.getMake() + " " + truck.getModel() + " is £" + bill);
        return bill;
    }

    public int calculateTotalStorageBill() {
        int totalBill = 0;
        for (Vehicle vehicle: storage) {

            if (vehicle instanceof Car) {
                totalBill += calculateVehicleBill((Car) vehicle);
            } else if (vehicle instanceof Motorbike) {
                totalBill += calculateVehicleBill((Motorbike) vehicle);
            } else if (vehicle instanceof Truck) {
                totalBill += calculateVehicleBill((Truck) vehicle);
            } else {
                System.out.println("ID: " + vehicle.getId() + "Unrecognized vehicle: bill will not be calculated for");
            }

        }
        System.out.println("The total bill for all vehicles in storage is £" + totalBill);
        return totalBill;
    }

    public void removeVehiclesByType(String type) {
        if (type.toLowerCase().trim().equals("car")) {
             this.storage = this.storage.stream().filter(vehicle -> !(vehicle instanceof Car)).collect(Collectors.toList());
        }
        else if (type.toLowerCase().trim().equals("motorbike")) {
            this.storage = this.storage.stream().filter(vehicle -> !(vehicle instanceof Motorbike)).collect(Collectors.toList());
        }
        if (type.toLowerCase().trim().equals("truck")) {
            this.storage = this.storage.stream().filter(vehicle -> !(vehicle instanceof Truck)).collect(Collectors.toList());
        }
    }

    public void emptyGarage() {
        this.storage.clear();
    }

    public List<Vehicle> getStorage() {
        return storage;
    }

    public void setStorage(List<Vehicle> storage) {
        this.storage = storage;
    }
}
