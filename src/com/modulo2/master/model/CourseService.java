package com.modulo2.master.model;

import java.util.zip.CheckedOutputStream;

public class CourseService {

    /**
     * Creating a professor to be able to add a course to the professor
     * */
    private final TeacherService teacherService = new TeacherService();

    // Creating courses
    private final Course course1 = new Course("Java","CS001",10, teacherService.getTeacher1());
    private final Course course2 = new Course("JavaScript", "CS002",10,teacherService.getTeacher2());

    // Getters
    public Course getCourse1(){return course1;}
    public Course getCourse2(){return course2;}
}