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

    /**
     * Method for writing students
     * It checks if there is a student and adds him to the course
     * */
    public boolean enrollStudent(Student student){
        if (this.studentCount < this.maxCapacity){
            this.enrolledStudents[this.studentCount] = student; // Creating the array
            this.studentCount++;
            return true; // Successful registration
        }else{
            return false; // Failed because the course is full
        }
    }
    // Method to obtain the list of students
    public Student[] getEnrolledStudents(){
        Student[] students = new Student[this.studentCount];
        for(int i = 0; i < this.studentCount; i++){
            students[i] = this.enrolledStudents[i];
        }
        return students;
    }
}
