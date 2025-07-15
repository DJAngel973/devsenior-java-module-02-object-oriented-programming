package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.view.InputUserUI;
import com.modulo2.classoneandtwo.view.PrimaryMenuUI;

public class AppController {

    // Attributes
    private final MenuController menuController;
    private final InputUserUI inputUserUI;
    private final PrimaryMenuUI primaryMenuUI;

    // Constructor, inject dependencies
    public AppController() {
        this.menuController = new MenuController();
        this.inputUserUI = new InputUserUI();
        this.primaryMenuUI = new PrimaryMenuUI();
    }

    // Method Start app
    public void start(){
        menuController.star();
    }
}
