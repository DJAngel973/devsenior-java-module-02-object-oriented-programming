package com.modulo2.master.model;

public class StudentService {

    // Create students
    private final Student student1 = new Student("Alberto Salazar", "T0145AlS");
    private final Student student2 = new Student("Andres Diaz", "T0146AnD");
    private final Student student3 = new Student("Sara Betancourt", "T0147SaB");
    private final Student student4 = new Student("Jose Prieto", "T0148JoP");

    // Getters
    public Student getStudent1(){return student1;}
    public Student getStudent2(){return student2;}
    public Student getStudent3(){return student3;}
    public Student getStudent4(){return student4;}
}
