package com.modulo2.master.model;

public class TeacherService {

    /**
     * Creating a department to be able to add a professor to the department
     * */
    private final DepartmentService departmentService = new DepartmentService();

    // Create teachers
    private final Teacher teacher1 = new Teacher("Alberto", "A501", departmentService.getComputingDept());
    private final Teacher teacher2 = new Teacher("Jose", "A502",departmentService.getComputingDept());
    private final Teacher teacher3 = new Teacher("Sandra","A503",departmentService.getDeveloperDept());

    // Getters
    public Teacher getTeacher1(){return teacher1;}
    public Teacher getTeacher2(){return teacher2;}
    public Teacher getTeacher3(){return teacher3;}
}