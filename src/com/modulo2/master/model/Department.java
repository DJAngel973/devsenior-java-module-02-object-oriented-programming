package com.modulo2.master.model;

public class Department {

    // Attributes
    private String name;
    private Teacher[] teachers;
    private Integer teacherCount = 0;

    // Constructor
    public Department(String name, Integer maxTeachers){
        this.name = name;
        this.teachers = new Teacher[maxTeachers];
    }

    // Getters
    public String getName(){
        return this.name;
    }

    /**
     * Adds a new teacher to the department if there is available space.
     * Checks the current position and adds the teacher,
     * then increments the count.
     * */
    public boolean addTeacher(Teacher teacher){
        // verify it there is space available in the array.
        if(this.teacherCount < this.teachers.length){
            this.teachers[this.teacherCount] = teacher;
            this.teacherCount++;
            return true;
        }else{
            return false;
        }
    }
    // Method
    public Teacher[] reDisplayTeacher(){
        Teacher[] teachers = new Teacher[this.teacherCount];
        for(int i = 0; i < this.teacherCount; i++){
            teachers[i] = this.teachers[i];
        }
        return teachers;
    }
}