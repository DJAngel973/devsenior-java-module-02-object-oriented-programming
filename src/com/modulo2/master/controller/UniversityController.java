package com.modulo2.master.controller;

import com.modulo2.master.model.*;
import com.modulo2.master.view.CourseUI;
import com.modulo2.master.view.InputUserUI;
import com.modulo2.master.view.UniversityUI;

public class UniversityController {

    // Created objects
    private final CourseService courseService = new CourseService();
    private final DepartmentService departmentService = new DepartmentService();
    private final StudentService studentService = new StudentService();
    private final TeacherService teacherService = new TeacherService();
    private final InputUserUI inputUserUI = new InputUserUI();
    private final UniversityUI universityUI = new UniversityUI();
    private final CourseUI courseUI = new CourseUI();

    // Message
    public void showMessage(){
        universityUI.firstMessage();
        courseUI.information(courseService.getCourse1());
        courseUI.information(courseService.getCourse2());
    }
}
