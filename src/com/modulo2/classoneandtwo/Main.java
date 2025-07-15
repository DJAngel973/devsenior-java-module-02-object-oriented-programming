package com.modulo2.classoneandtwo;

import com.modulo2.classoneandtwo.controller.AppController;
import com.modulo2.classoneandtwo.view.InputUserUI;

public class Main {
    public static void main(String[] args) {

        // Create object for initialize
        AppController appController = new AppController();

        // Create object for close Scanner
        InputUserUI readUser = new InputUserUI();

        // Start
        appController.start();

        // Close Scanner
        readUser.close();
    }
}
