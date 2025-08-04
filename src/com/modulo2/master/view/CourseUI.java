package com.modulo2.master.view;

import com.modulo2.master.model.Course;
import com.modulo2.master.model.Student;

public class CourseUI {
    // Show information
    public void information(Course course){
        System.out.printf("""
                Curso %s - %s
                Nombre profesor: %s
                Cantidad maxima: %d
                \n""",course.getName(), course.getCourseCode(), course.getTeacher(), course.getMaxCapacity());
    }
    // Method success or error message
    public void displayEnrollmentResult(boolean success, Course course, Student student){
        if(success){
            System.out.printf("Estudiante %s matriculado en %s.\n", student.getName(), course.getName());
        }else{
            System.out.printf("ERROR: El curso %s esta lleno. No se puede matricular a %s.\n", course.getName(), student.getName());
        }
    }
    /**
     * Method to show students
     * We show the students who are enrolled
     * */
    public void displayEnrolledStudents(Course course){
        System.out.printf("Estudiantes matriculados en %s:",
                course.getName());
        Student[] students = course.getEnrolledStudents();
        if (students.length == 0) {
            System.out.println("No hay estudiantes matriculados.");
        }else{
            for (Student student : students){
                System.out.printf("* %s ID: %s",
                        student.getName(),
                        student.getIdStudent());
            }
        }
    }
}
