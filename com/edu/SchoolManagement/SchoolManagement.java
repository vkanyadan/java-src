package com.edu.SchoolManagement;

import java.util.ArrayList;

/**
 * Created by vibs on 1/1/17.
 */
public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School("Wheeler");

        for (int i=1; i <=10; i++) {
            System.out.println("index i: " + i);
            school.createGrade(i);
        }
        Grade grade_one = school.getGrade(0);
        grade_one.addStudent("Vibhav", Student.Sex.Male);

        school.printDescription();

    }
}
