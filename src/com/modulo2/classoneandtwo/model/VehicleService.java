package com.modulo2.classoneandtwo.model;

public class VehicleService {

    // Add objects
    private final Car myCar = new Car("Toyota", "Corolla", 2022, 4);
    private final Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR500R", 2023, 500);
    private final Truck myTruck = new Truck("Volvo", "FH16", 2021, 2500);

    // Getters
    public Car getMyCar() {
        return myCar;
    }
    public Motorcycle getMyMotorcycle(){
        return myMotorcycle;
    }
    public Truck getMyTruck(){
        return myTruck;
    }
}
