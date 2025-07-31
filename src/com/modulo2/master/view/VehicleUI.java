package com.modulo2.master.view;

import com.modulo2.master.model.Vehicle;

public class VehicleUI {

    // Method message
    public void titleMessage(){
        System.out.println("\uD83D\uDE97 \uD83C\uDFCD\uFE0F \uD83D\uDEFB Flota de vehículos \uD83D\uDE97 \uD83C\uDFCD\uFE0F \uD83D\uDEFB \n");
    }

    // Method show information vehicle
    public void showInfoVehicle(Vehicle vehicle){
        System.out.println(vehicle.vehicleInformation());
    }
    // Method to show vehicle movement
    public void moveVehicle(Vehicle vehicle){
        System.out.println(vehicle.vehicleMove());
    }
}
