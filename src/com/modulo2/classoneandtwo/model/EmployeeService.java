package com.modulo2.classoneandtwo.model;

import com.modulo2.classoneandtwo.view.EmployeeUI;

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
    public String annualSalary(Employee employee){

        Double fullSalary = employee.getMonthlySalary() *12;
        // We multiply by 12 to know the annual salary
        return String.format("Salario anual de %s es $%.2f\n",employee.getFullName(),fullSalary);
    }

    // Modify salary employee
    public void updateSalary(Employee employee, Double newSalary){
        employee.setMonthlySalary(newSalary); // Update new salary
    }
}
