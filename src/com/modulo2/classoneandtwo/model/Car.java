package com.modulo2.classoneandtwo.model;

import com.modulo2.classoneandtwo.interfaz.IBootable;

// Implement at interface IBootable
public class Car extends Vehicle implements IBootable {

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
                Número de puertas: %s""", getBrand(), getModel(), getYear(), getDoorsNumber());
    }
    // Method move
    @Override
    public String vehicleMove(){
        return String.format("El carro de marca %s se esta moviendo por la via al llano.", getBrand());
    }

    // Concrete implementation of the method
    @Override
    public void startUp() {
        System.out.println("El carro necesita las llaves y estar con combustible para poder encender.\n");
    }
}
