package com.modulo2.master.model;

public class Course {

    // Attributes
    private String name;
    private String courseCode;
    private Integer maxCapacity;
    private Teacher teacher; // Association, the course must be taught by a Teacher
    private Student[] enrolledStudents; // Composition or Aggregation, a course has several Teachers
    private int studentCount = 0; // To count enrolled students.

    // Constructor
    public Course(String name, String courseCode, Integer maxCapacity, Teacher teacher){
        this.name = name;
        this.courseCode = courseCode;
        this.maxCapacity = maxCapacity;
        this.teacher = teacher;
        // Composition, the course creates the array of its students
        this.enrolledStudents = new Student[maxCapacity];
        System.out.printf("Curso %s creado con capacidad para %d estudiantes.",
                this.name,
                maxCapacity);
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public String getCourseCode(){
        return this.courseCode;
    }
    public Integer getMaxCapacity(){
        return this.maxCapacity;
    }
    public Teacher getTeacher(){
        return this.teacher;
    }
    public Student[] getEnrolledStudents(){
        return this.enrolledStudents;
    }
    public int getStudentCount(){
        return this.studentCount;
    }

    /**
     * Method for writing students
     * It checks if there is a student and adds him to the course
     * */
    public void enrollStudent(Student student){
        if (this.studentCount < this.maxCapacity){
            this.enrolledStudents[this.studentCount] = student; // Creating the array
            this.studentCount++;
            System.out.printf("Estudiante %s matriculado en %s.",
                    student.getName(),
                    this.name);
        }else{
            System.out.printf("ERROR: El curso %s esta lleno, No se puede matricular a %s.",
                    this.name,
                    student.getName());
        }
    }
    /**
     * Method to show students
     * We show the students who are enrolled
     * */
    public void displayEnrolledStudents(Student student){
        System.out.printf("Estudiantes matriculados en %s:",
                this.name);
        if (this.studentCount == 0) {
            System.out.println("No hay estudiantes matriculados.");
        }else{
            for (int i = 0; i < this.studentCount; i++){
                if (this.enrolledStudents[i] != null){
                    System.out.printf("* %s ID: %s",
                            this.enrolledStudents[i].getName(),
                            this.enrolledStudents[i].getIdStudent());
                }
            }
        }
    }
}
