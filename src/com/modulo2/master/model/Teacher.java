package com.modulo2.master.model;

public class Teacher {

    /**
     * Attributes Teacher
     */
    private String name;
    private String idTeacher;
    private Department department; // Relation (aggregation)

    // Constructor
    public Teacher(String name, String idTeacher, Department department){
        this.name = name;
        this.idTeacher = idTeacher;
        this.department = department;
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public String getIdTeacher(){
        return this.idTeacher;
    }
    public Department getDepartment(){
        return this.department;
    }
    @Override
    public String toString(){
        return String.format("%s - %s", name, idTeacher);
    }
}