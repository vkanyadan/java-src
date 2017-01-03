package com.edu.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vibs on 1/1/17.
 */
public class Grade {
    private final int grade_;
    private int student_id_;
    private final List<Student> students_;
    private final List<Teacher> teachers_;


    public Grade(int grade_) {
        this.grade_ = grade_;
        this.student_id_ = 1;
        students_ = new ArrayList<>();
        teachers_ = new ArrayList<>();
    }

    public void printDescription() {
        System.out.println("Grade number: " + grade_);
        for (Student s: students_) {
            s.printDescription();
        }
    }
    public void addStudent(String name, Student.Sex student_sex) {
        Student student = new Student(name, grade_, student_id_, student_sex);
        students_.add(student);
        student_id_++;

    }
}
