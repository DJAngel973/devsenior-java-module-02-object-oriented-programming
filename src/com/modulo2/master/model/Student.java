package com.modulo2.master.model;

public class Student {

    // Attributes
    private String name;
    private String idStudent;

    // Constructor
    public Student(String name, String idStudent){
        this.name = name;
        this.idStudent = idStudent;
    }
    public Student(){}

    // Getters
    public String getName(){ return this.name; }
    public String getIdStudent(){
        return this.idStudent;
    }

    // Method abstract
    //public abstract String displayInfo();
}
