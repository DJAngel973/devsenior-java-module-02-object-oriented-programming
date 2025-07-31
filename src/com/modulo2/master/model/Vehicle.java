package com.modulo2.master.model;

public abstract class Vehicle {


    // Attributes
    private String brand;
    private String model;
    private Integer year;

    // Constructor
    public Vehicle(String brand, String model, Integer year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public Vehicle(){
    }
    public Vehicle(String brand){
        this(brand, "", 0);
    }

    // Getters
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public Integer getYear(){
        return year;
    }

    // Method show information
    public abstract String vehicleInformation();
    // Method move
    public abstract String vehicleMove();
}
