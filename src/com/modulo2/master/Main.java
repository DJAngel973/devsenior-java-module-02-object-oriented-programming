package com.modulo2.master;

import com.modulo2.master.controller.AppController;

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
