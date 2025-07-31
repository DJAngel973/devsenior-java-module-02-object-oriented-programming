package com.modulo2.master.controller;

import com.modulo2.master.view.InputUserUI;
import com.modulo2.master.view.MenuClass1UI;

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
                case 1 -> exampleBook();
                case 2 -> firstExercise();
                case 3 -> {
                    System.out.println("Gracias.");
                    exit = true;
                }
                default -> System.out.println("Ingresa una opción valida.");
            }
        }
    }
    // Method example book
    public void exampleBook(){
        BookController bookController = new BookController();
        bookController.showMessage();
        bookController.showBook();
    }
    // Method first exercise
    public void firstExercise(){
        EmployeeController employeeController = new EmployeeController();
        employeeController.showMessage();
        employeeController.showEmployee();
        employeeController.modifySalary();
    }
}
