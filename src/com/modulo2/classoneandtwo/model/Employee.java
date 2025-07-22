package com.modulo2.classoneandtwo.model;

public class Employee {

    // Attributes
    private String fullName;
    protected final String idEmployee;
    private Double monthlySalary;
    private String department;

    // Constructor
    public Employee(){
    }
    public Employee(String fullName, String idEmployee, Double monthlySalary, String department){
        this.fullName = fullName;
        this.idEmployee = idEmployee;
        this.monthlySalary = monthlySalary;
        this.department = department;
    }
    public Employee(String fullName, String idEmployee, String department){
        this(fullName, idEmployee, 0.0, department);
    }

    // Getters
    public String getFullName(){
        return fullName;
    }
    public String getIdEmployee(){
        return idEmployee;
    }
    public Double getMonthlySalary(){
        return monthlySalary;
    }
    public String getDepartment(){
        return department;
    }

    // Setters
    public void setMonthlySalary(Double monthlySalary) {
        if (monthlySalary < 0){
            throw new IllegalArgumentException("Error el valor no puede ser negativo.");
        }
        this.monthlySalary = monthlySalary;
    }
    public void setDepartment(String department){
        this.department = department;
    }
}
