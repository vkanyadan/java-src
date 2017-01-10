package com.edu.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vibs on 1/1/17.
 */
public class School {
    private final String name_;
    private final List<Grade> grades_;

    public School(String name_) {
        this.name_ = name_;
        this.grades_ = new ArrayList<>();
    }
    public void printDescription() {
        System.out.println("Name of school: " + name_);
        for (Grade g: grades_) {
            g.printDescription();
        }
    }
    public void createGrade(int grade) {
        Grade new_grade = new Grade(grade);
        this.grades_.add(new_grade);
    }

    public Grade getGrade(int i) {
        return grades_.get(i);

    }

}
