package com.edu.SchoolManagement;

/**
 * Created by vibs on 1/3/17.
 */
public class Exam {
    private final String name_; // e.g. midterm/finals/periodic.
    private float score_;

    public Exam(String name_) {
        this.name_ = name_;
        this.score_ = 0;
    }
    public void updateScore(float score) {
        this.score_ = score;
    }
}
