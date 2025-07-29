package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.view.Class3UI;
import com.modulo2.classoneandtwo.view.InputUserUI;

public class MenuClass3Controller {

    // Attributes
    private final Class3UI class3UI;
    private final InputUserUI inputUserUI;

    // Constructor
    public MenuClass3Controller(){
        this.class3UI = new Class3UI();
        this.inputUserUI = new InputUserUI();
    }

    // Menu
    public void menuClass3(){

        // Variables
        int option;
        boolean exit = false;

        while(!exit){

            class3UI.welcome(); // Show welcome
            class3UI.menuClass3(); // Show menu
            option = inputUserUI.optionUser();

            switch (option){
                case 1 -> explication();
                case 2 -> example();
                case 3 -> {
                    System.out.println("Gracias.");
                    exit = true;}
                default -> System.out.println("Ingresa una opción valida.");
            }
        }
    }
    // Methods option one, explication
    public void explication(){
        class3UI.explication();
    }
    // Method option two, example
    public void example(){

    }
}
