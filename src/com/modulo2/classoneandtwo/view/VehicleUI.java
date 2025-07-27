package com.modulo2.classoneandtwo.view;

import com.modulo2.classoneandtwo.model.Book;
import com.modulo2.classoneandtwo.model.Vehicle;
import com.modulo2.classoneandtwo.model.VehicleService;

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
