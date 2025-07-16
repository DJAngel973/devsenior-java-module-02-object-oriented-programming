package com.modulo2.classoneandtwo;

import com.modulo2.classoneandtwo.controller.AppController;
import com.modulo2.classoneandtwo.view.InputUserUI;

public class Main {
    public static void main(String[] args) {

        // Create object for initialize
        AppController appController = new AppController();

        // Start
        appController.start();
        // Close Scanner
        appController.close();
    }
}
