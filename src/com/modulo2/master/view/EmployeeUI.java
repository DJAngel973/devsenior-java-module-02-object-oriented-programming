package com.modulo2.master.view;

import com.modulo2.master.model.Employee;

public class EmployeeUI {

    // message
    public void firstMessage(){
        System.out.println("\uD83E\uDDD1\u200D\uD83D\uDCBB Empleados \uD83E\uDDD1\u200D\uD83D\uDCBB\n");
    }

    // Show information
    public void information(Employee employee){
        System.out.printf("""
                Información empleado
                Nombre: %s
                Id Empleado: %s
                Salario mensual: %.2f
                Departamento: %s
                \n""", employee.getFullName(), employee.getIdEmployee(), employee.getMonthlySalary(), employee.getDepartment());
    }

    // Method example explanation Book
    public void exampleEmployee(){
        System.out.println("""
                ⚡ En este ejemplo de Empleado usamos multiples constructores para crear objetos,
                inicializándolos de diferentes formas con diferentes atributos, se implementa los getters que
                nos permiten acceder a los atributos de manera controlada, dando un inicio a la encapsulación
                y a la programación orientada a objetos.
                """);
    }

    // Request salary
    public void requestSalary(Employee employee){
        System.out.printf("Ingresa el nuevo salario para %s : ", employee.getFullName());
    }

    // show annual salary
    public void showFullSalary(String message){
        System.out.println(message);
    }
}
