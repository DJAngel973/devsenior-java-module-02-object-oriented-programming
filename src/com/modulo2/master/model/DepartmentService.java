package com.modulo2.master.model;

public class DepartmentService {

    // Create Departments
    private final Department computingDept = new Department("Ciencias de la computación.",5);
    private final Department developerDept = new Department("Programación.", 3);

    // Getters
    public Department getComputingDept(){return computingDept;}
    public Department getDeveloperDept(){return developerDept;}
}
