package com.modulo2.master.controller;

import com.modulo2.master.model.*;
import com.modulo2.master.view.CourseUI;
import com.modulo2.master.view.DepartmentUI;
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
    private final DepartmentUI departmentUI = new DepartmentUI();

    // Message
    public void showMessage(){
        universityUI.firstMessage();
    }
    // show departments
    public void showDepartment(){

        // Added the professor to the department
        departmentService.addTeacherDep(teacherService.getTeacher1(), departmentService.getDeveloperDept());
        departmentService.addTeacherDep(teacherService.getTeacher2(), departmentService.getComputingDept());
        departmentService.reDisplayTeacherDep(departmentService.getDeveloperDept());
        departmentService.reDisplayTeacherDep(departmentService.getComputingDept());

        // title
        universityUI.mesTeacher();

        departmentUI.displayTeacherResult( true, teacherService.getTeacher2(), departmentService.getComputingDept());
        departmentUI.displayTeacherResult( true, teacherService.getTeacher1(), departmentService.getDeveloperDept());
        departmentUI.displayTeacher(teacherService.getTeacher1(), departmentService.getDeveloperDept());
        departmentUI.displayTeacher(teacherService.getTeacher2(), departmentService.getComputingDept());

        // Show courses
        courseUI.information(courseService.getCourse1());
        courseUI.information(courseService.getCourse2());
    }
    //
    public void showStudent(){

        // Add student to the course
        courseService.enrollStudentCourse(courseService.getCourse1(), studentService.getStudent1());
        courseService.enrollStudentCourse(courseService.getCourse2(), studentService.getStudent2());
        courseService.enrollStudentCourse(courseService.getCourse1(), studentService.getStudent3());
        courseService.enrollStudentCourse(courseService.getCourse2(), studentService.getStudent4());
        courseService.getStudentsInCourse(courseService.getCourse1());
        courseService.getStudentsInCourse(courseService.getCourse2());

        // title
        universityUI.mesStudent();

        courseUI.displayEnrollmentResult(true, courseService.getCourse1(), studentService.getStudent1());
        courseUI.displayEnrollmentResult(true, courseService.getCourse2(), studentService.getStudent2());
        courseUI.displayEnrollmentResult(true, courseService.getCourse1(), studentService.getStudent3());
        courseUI.displayEnrollmentResult(true, courseService.getCourse2(), studentService.getStudent4());

        courseUI.displayEnrolledStudents(courseService.getCourse1());
        courseUI.displayEnrolledStudents(courseService.getCourse2());
    }
}
