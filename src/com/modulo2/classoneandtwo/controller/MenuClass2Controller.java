package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.view.Class2UI;
import com.modulo2.classoneandtwo.view.InputUserUI;

public class MenuClass2Controller {

    // Attributes
    private final Class2UI class2UI;
    private final InputUserUI inputUserUI;

    // Constructor
    public MenuClass2Controller(){
        this.class2UI = new Class2UI();
        this.inputUserUI = new InputUserUI();
    }

    // Menu
    public void menuClass2(){

        // Variables
        int option;
        boolean exit = false;

        // implement while loop to ensure that it remains in the menu until the user wants to exit
        while(!exit) {

            class2UI.menuClass2(); // Called menu
            option = inputUserUI.optionUser();

            switch (option){
                case 1 -> {
                    class2UI.explication(); // Called method message explication
                }
                case 2 -> {}
                case 3 -> {
                    System.out.println("Gracias.");
                    exit = true;}
                default -> System.out.println("Ingresa una opción valida.");
            }
        }
    }
}
