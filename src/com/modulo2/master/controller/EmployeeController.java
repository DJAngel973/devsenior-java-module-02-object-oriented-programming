package com.modulo2.master.controller;

import com.modulo2.master.model.EmployeeService;
import com.modulo2.master.view.EmployeeUI;
import com.modulo2.master.view.InputUserUI;

public class EmployeeController {

    // Instantiate objects
    private final EmployeeUI employeeUI = new EmployeeUI();
    private final EmployeeService employeeService = new EmployeeService();
    private final InputUserUI inputUserUI = new InputUserUI();

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

    // Modify salary employee
    public void modifySalary(){

        // show message and input data
        employeeUI.requestSalary(employeeService.getEmployee2());
        Double newSalary = inputUserUI.salary();

        // Modify salary of employee
        employeeService.updateSalary(employeeService.getEmployee2(), newSalary);
        employeeUI.information(employeeService.getEmployee2());

        // show annual Salary
        String fullSalary = employeeService.annualSalary(employeeService.getEmployee2());
        employeeUI.showFullSalary(fullSalary);
    }
}
