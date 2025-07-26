package com.modulo2.classoneandtwo.model;

public class Car extends Vehicle {

    // Attributes
    private Integer doorsNumber;

    // Constructor
    public Car(String brand, String model, Integer year, Integer doorsNumber){
        super(brand, model, year);
        this.doorsNumber = doorsNumber;
    }

    // Getters
    public Integer getDoorsNumber(){
        return doorsNumber;
    }

    // Polymorphism implement with @override
    @Override
    public String vehicleInformation(){
        return String.format("""
                Marca: %s
                Modelo: %s
                Año: %d
                Número de puertas: %s
                """, getBrand(), getModel(), getYear(), getDoorsNumber());
    }
    // Method move
    public String vehicleMove(){
        return String.format("El vehiculo de marca %s se esta moviendo por la via al llano.", getBrand());
    }
}
