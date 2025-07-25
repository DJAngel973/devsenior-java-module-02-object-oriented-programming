package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.view.InputUserUI;
import com.modulo2.classoneandtwo.view.PrimaryMenuUI;

public class MenuController {

    // Attributes
    private final PrimaryMenuUI primaryMenuUI;
    private final InputUserUI inputUserUI;

    // Create constructor depends on view
    public MenuController() {
        this.primaryMenuUI = new PrimaryMenuUI();
        this.inputUserUI = new InputUserUI();
    }

    // Method to start
    // Controller the flow of primary menu
    public void star(){

        // Create variables
        boolean exit = false;
        int option;

        // Loop for menu
        while(!exit){
            primaryMenuUI.showMenu(); // Called at method for show primary menu
            option = inputUserUI.optionUser(); // Called at method for take option user

            switch (option) {
                case 1 -> firstClass();
                case 2 -> secondClass();
                case 3 -> {
                    System.out.println("Gracias por participar.");
                    exit = true;
                }
                default -> System.out.println("Ingresa una opción valida.");
            }
        }
    }
    // Method that calls submenu class1
    public void firstClass(){
        MenuClass1Controller menuClass1Controller = new MenuClass1Controller();
        menuClass1Controller.menuClass1();
    }
    // Method that calls submenu class2
    public void secondClass(){
        MenuClass2Controller menuClass2Controller = new MenuClass2Controller();
        menuClass2Controller.menuClass2();
    }
}
