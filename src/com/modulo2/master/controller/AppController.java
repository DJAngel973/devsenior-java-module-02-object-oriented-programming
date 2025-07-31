package com.modulo2.master.controller;

import com.modulo2.master.view.InputUserUI;
import com.modulo2.master.view.PrimaryMenuUI;

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

    public void close(){
        inputUserUI.close();
    }
}
