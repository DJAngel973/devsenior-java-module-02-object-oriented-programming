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
        System.out.printf("Departamento %s creado con capacidad para %d profesores.",
                this.name,
                maxTeachers);
    }

    // Getters
    public String getName(){
        return name;
    }

    /**
     * Adds a new teacher to the department if there is available space.
     * Checks the current position and adds the teacher,
     * then increments the count.
     * */
    public void addTeacher(Teacher teacher){
        // verify it there is space available in the array.
        if(this.teacherCount < this.teachers.length){
            this.teachers[this.teacherCount] = teacher;
            this.teacherCount++;
            System.out.printf("Profesor %s agregando al departamento %s.",
                    teacher.getName(),
                    this.name);
        }else{
            System.out.printf("ERROR: El departamento %s esta lleno, no se puede agregar a %s.",
                    this.name,
                    teacher.getName());
        }
    }

    /**
     * Display the list ot teachers in the department.
     * If there are no teachers,
     * is shows an appropriate message.
     * */
    public void displayTeacher(){

        // Show department name
        System.out.printf("Profesores en el departamento %s.",
                this.name);
        // Check if there are any teachers.
        if (this.teacherCount == 0){
            System.out.println(" No hay profesores.");
        }else { // Look through the array to display  each non-null teacher.
            for (int newTeac = 0; newTeac < teachers.length; newTeac++) {
                if (this.teachers[newTeac] != null) {
                    System.out.printf("* %s\n* %s\n",
                            this.teachers[newTeac].getName(),
                            this.teachers[newTeac].getIdTeacher());
                }
            }
        }
    }
}
