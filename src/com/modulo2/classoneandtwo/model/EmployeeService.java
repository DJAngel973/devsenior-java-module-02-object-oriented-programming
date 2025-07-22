package com.modulo2.classoneandtwo.model;

public class EmployeeService {

    // Show information
    public void information(Employee employee){
        System.out.printf("""
                Información empleado
                Nombre: %s
                Id Empleado: %s
                Salario mensual: %.2f
                Departamento: %s
                """, employee.getFullName(), employee.getIdEmployee(), employee.getMonthlySalary(), employee.getDepartment());
    }

    // Calculate annual salary
    public Double annualSalary(Employee employee){
        // We multiply by 12 to know the annual salary
        return employee.getMonthlySalary() *12;
    }
}
