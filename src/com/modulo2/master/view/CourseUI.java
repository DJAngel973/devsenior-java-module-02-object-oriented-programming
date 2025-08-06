package com.modulo2.master.view;

import com.modulo2.master.model.Course;
import com.modulo2.master.model.Student;

public class CourseUI {
    // Show information
    public void information(Course course){
        System.out.printf("""
                \nCurso %s - %s
                Nombre profesor: %s
                Cantidad maxima: %d
                \n""",course.getName(), course.getCourseCode(), course.getTeacher(), course.getMaxCapacity());
    }
    // Method success or error message
    public void displayEnrollmentResult(boolean success, Course course, Student student){
        if(success){
            System.out.printf("%s matriculándose al curso de %s.\n", student.getName(), course.getName());
        }else{
            System.out.printf("ERROR: El curso %s esta lleno. No se puede matricular a %s.\n\n", course.getName(), student.getName());
        }
    }
    /**
     * Method to show students
     * We show the students who are enrolled
     * */
    public void displayEnrolledStudents(Course course){
        System.out.printf("\nEstudiantes matriculados en %s: \n",
                course.getName());
        Student[] students = course.getEnrolledStudents();
        if (students.length == 0) {
            System.out.println("No hay estudiantes matriculados.\n");
        }else{
            for (Student student : students){
                System.out.printf("* %s ID: %s.\n",
                        student.getName(),
                        student.getIdStudent());
            }
        }
    }
}
