package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.model.Employee;
import com.modulo2.classoneandtwo.view.InputUserUI;
import com.modulo2.classoneandtwo.view.MenuClass1UI;

public class MenuClass1Controller {

    // Attributes
    private final MenuClass1UI menuClass1UI;
    private final InputUserUI inputUserUI;

    // Constructor
    public MenuClass1Controller() {
        this.menuClass1UI = new MenuClass1UI();
        this.inputUserUI = new InputUserUI();
    }

    // Menu
    public void menuClass1(){

        // Variable
        boolean exit = false;
        int option;

        // Show message first class
        menuClass1UI.firstClass();

        // Loop for menu
        while(!exit){
            menuClass1UI.menuClass1(); // Called at method for show primary menu
            option = inputUserUI.optionUser(); // Called at method for take option user

            switch (option) {
                case 1 -> {
                    BookController bookController = new BookController();
                    bookController.showMessage();
                    bookController.showBook();
                }
                case 2 -> {
                    EmployeeController employeeController = new EmployeeController();
                    employeeController.showMessage();
                    employeeController.showEmployee();
                    employeeController.modifySalary();
                }
                case 3 -> {
                    System.out.println("Gracias.");
                    exit = true;
                }
                default -> System.out.println("Ingresa una opción valida.");
            }
        }
    }
}
