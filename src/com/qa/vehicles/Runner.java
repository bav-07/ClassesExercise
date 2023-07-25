package com.qa.vehicles;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Car c1 = new Car(1, 4, 5, 100, false, "Nissan", "Micra", "petrol", "Red", 500, 5);
        Car c2 = new Car(2, 4, 5, 200, false, "Volkswagen", "Polo", "petrol", "Blue", 500, 5);
        Car c3 = new Car(3, 4, 3, 500, false, "Mazda", "RX-7", "petrol", "Red", 200, 3);
        Motorbike b1 = new Motorbike(4, 2, 1, 200, false, "Ducati", "S500", "petrol", "Black", false);
        Truck t1 = new Truck(5, 16, 3, 800, false, "Volvo", "FMX", "petrol", "white", 2, 10000, true);
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(c1);
        vehicleList.add(c2);
        vehicleList.add(c3);
        vehicleList.add(b1);
        vehicleList.add(t1);

        Garage garage = new Garage(vehicleList);

        System.out.println(garage.storage);
//        garage.fixVehicle(1);
//        garage.fixVehicle(2);
//        garage.fixVehicle(3);
//        garage.fixVehicle(4);
//        garage.fixVehicle(5);

        garage.calculateTotalStorageBill();

        garage.removeVehiclesByType("motorbike");
        System.out.println(garage.storage);
        garage.removeVehiclesByType("truck");
        System.out.println(garage.storage);
        garage.removeVehiclesByType("car");
        System.out.println(garage.storage);

        garage.addVehicle(c1);
        garage.addVehicle(b1);
        garage.removeVehicle(1);
        garage.removeVehicle(4);
        garage.removeVehicle(6);

        garage.setStorage(vehicleList);
        garage.emptyGarage();
        System.out.println(garage.getStorage().size());

    }



}
