package com.modulo2.classoneandtwo.model;

import java.lang.module.ModuleReader;

public class Motorcycle extends Vehicle{

    // Attribute
    private Integer cylinder;

    // Constructor
    public Motorcycle(String brand, String model, Integer year, Integer cylinder){
        super(brand, model, year);
        this.cylinder = cylinder;
    }

    // Getter
    public Integer getCylinder(){
        return cylinder;
    }

    // Polymorphism implement with @override
    @Override
    public String vehicleInformation() {
        return String.format("""
                Marca: %s
                Modelo: %s
                Año: %d
                Cilindrada: %d
                """, getBrand(), getModel(), getYear(), getCylinder());
    }
    @Override
    public String vehicleMove(){
        return String.format("La motocicleta %s esta acelerando", getBrand());
    }
}