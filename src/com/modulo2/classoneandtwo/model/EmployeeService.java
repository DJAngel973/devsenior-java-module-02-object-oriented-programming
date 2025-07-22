package com.modulo2.classoneandtwo.model;

public class EmployeeService {

    // Instantiate Employee objects
    private final Employee employee1 = new Employee("Julio Alberto Roa Mendez", "J00487");
    private final Employee employee2 = new Employee("Andres Martinez Salazar", "A00488", "Facturación");
    private final Employee employee3 = new Employee("Pedro Garcia Orozco", "P00489", 1_897_000.0,"Logística");

    // Getters
    public Employee getEmployee1(){
        return employee1;
    }
    public Employee getEmployee2(){
        return employee2;
    }
    public Employee getEmployee3(){
        return employee3;
    }

    // Calculate the annual salary by multiplying monthly salary by 12
    public Double annualSalary(Employee employee){
        // We multiply by 12 to know the annual salary
        return employee.getMonthlySalary() *12;
    }
}
