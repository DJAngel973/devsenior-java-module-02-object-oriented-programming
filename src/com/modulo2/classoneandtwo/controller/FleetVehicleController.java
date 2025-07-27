package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.interfaz.IBootable;
import com.modulo2.classoneandtwo.model.VehicleService;
import com.modulo2.classoneandtwo.view.VehicleUI;

public class FleetVehicleController {

    // Add objects
    private final VehicleUI vehicleUI = new VehicleUI();
    private final VehicleService vehicleService = new VehicleService();
    // Show polymorphism by interfaces
    private final IBootable bootableCar = vehicleService.getMyCar();
    private final IBootable bootableMotorcycle = vehicleService.getMyMotorcycle();

    // Messages
    public void message(){
        vehicleUI.titleMessage();
    }
    // Show vehicle added in vehicleService class
    public void showVehicle(){
        vehicleUI.showInfoVehicle(vehicleService.getMyCar());
        vehicleUI.moveVehicle(vehicleService.getMyCar());
        bootableCar.startUp();
        vehicleUI.showInfoVehicle(vehicleService.getMyMotorcycle());
        vehicleUI.moveVehicle(vehicleService.getMyMotorcycle());
        bootableMotorcycle.startUp();
        vehicleUI.showInfoVehicle(vehicleService.getMyTruck());
        vehicleUI.moveVehicle(vehicleService.getMyTruck());
    }
}
