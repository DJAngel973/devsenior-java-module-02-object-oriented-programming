package com.modulo2.master.view;

import com.modulo2.master.model.Department;
import com.modulo2.master.model.Teacher;

public class DepartmentUI {

    // Method success or error message
    public void displayTeacherResult(boolean success, Teacher teacher, Department department){
        if(success){
            System.out.printf("Profesor %s agregando al departamento %s\n",
                    teacher.getName(), department.getName());
        }else{
            System.out.printf("ERROR: El departamento %s esta lleno, no se puede agregar a %s\n",
                    department.getName(),
                    teacher.getName());
        }
    }
    /**
     * Display the list ot teachers in the department.
     * If there are no teachers,
     * is shows an appropriate message.
     * */
    public void displayTeacher(Teacher teacher, Department department){

        // Show department name
        System.out.printf("Profesores en el departamento %s:\n",
                department.getName());
        Teacher[] teachers = department.reDisplayTeacher();
        // Check if there are any teachers.
        if (teachers.length == 0){
            System.out.println(" No hay profesores.");
        }else { // Look through the array to display  each non-null teacher.
            for (Teacher teacherr : teachers) {
                System.out.printf("* %s - %s\n",
                        teacher.getName(),
                        teacher.getIdTeacher());
            }
        }
    }
}