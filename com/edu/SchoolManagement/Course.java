package com.edu.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vibs on 1/1/17.
 */
public class Course {
    private final String name_;
    private final List<Exam> exams_;

    public Course(String name_) {
        this.name_ = name_;
        this.exams_ = new ArrayList<>();
    }

    public void addExam(Exam e) {
        this.exams_.add(e);
    }

    public void printDescription() {
        System.out.println("Course name: " + name_);
    }
}
