package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.model.EmployeeService;
import com.modulo2.classoneandtwo.view.EmployeeUI;

public class EmployeeController {

    // Instantiate objects
    private final EmployeeUI employeeUI = new EmployeeUI();
    private final EmployeeService employeeService = new EmployeeService();

    // Messages
    public void showMessage(){
        employeeUI.exampleEmployee();
        employeeUI.firstMessage();
    }

    // Show employees
    public void showEmployee(){
        employeeUI.information(employeeService.getEmployee1());
        employeeUI.information(employeeService.getEmployee2());
        employeeUI.information(employeeService.getEmployee3());
    }
}
