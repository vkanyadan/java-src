package com.edu.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vibs on 1/1/17.
 */
public class Student {
    private final String name_;
    private final int grade_;
    private final int student_id_;
    private final Sex sex_;
    private final List<Course> courses_;

    public Student(String name_, int grade_, int student_id_, Sex sex_) {
        this.name_ = name_;
        this.grade_ = grade_;
        this.student_id_ = student_id_;
        this.sex_ = sex_;
        this.courses_ = new ArrayList<>();
    }

    public enum Sex {
        Male,
        Female
    }
    public void printDescription() {
        System.out.println("Student name: " + name_ + " Grade: " + grade_ + "id: " + student_id_);
        System.out.println("Student Courses:");
        for (Course c : courses_) {
            c.printDescription();
        }
    }

    public void addCourse(Course c) {
        this.courses_.add(c);

    }

}
