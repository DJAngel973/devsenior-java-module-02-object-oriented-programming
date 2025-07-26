package com.modulo2.classoneandtwo.model;

public class Truck extends Vehicle{

    // Attribute
    private Integer loadCapacity;

    // Constructor
    public Truck(String brand, String model, Integer year, Integer loadCapacity){
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    // Getter
    public Integer getLoadCapacity(){
        return loadCapacity;
    }

    // Polymorphism implement with @override
    @Override
    public String vehicleInformation() {
        return String.format("""
                Marca: %s
                Modelo: %s
                Año: %d
                Capacidad de carga: %d kilos
                """, getBrand(), getModel(), getYear(), getLoadCapacity());
    }
    @Override
    public String vehicleMove(){
        return String.format("La camión lleva %d kilos y esta avanzando lentamente", getLoadCapacity());
    }
}
