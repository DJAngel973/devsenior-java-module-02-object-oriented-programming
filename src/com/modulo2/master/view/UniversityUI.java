package com.modulo2.master.view;

import com.modulo2.master.model.Course;
import com.modulo2.master.model.Student;

public class UniversityUI {

    // message
    public void firstMessage(){
        System.out.println("\uD83E\uDDD1\u200D\uD83D\uDCBB Universidad \uD83E\uDDD1\u200D\uD83D\uDCBBn");
    }

    // Show information
    public void information(Course course){
        System.out.printf("""
                Curso %s - %s
                Nombre profesor: %s
                Cantidad maxima: %d
                \n""",course.getName(), course.getCourseCode(), course.getTeacher(), course.getMaxCapacity());
    }
}
