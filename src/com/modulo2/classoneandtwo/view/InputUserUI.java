package com.modulo2.classoneandtwo.view;

import java.util.Scanner;

public class InputUserUI {

    // Create variable for take data user
    private final Scanner input = new Scanner(System.in);

    // Method take option user menu
    public int optionUser(){
        return input.nextInt();
    }

    // Method for close Scanner
    public void close(){
        input.close();
    }
}
