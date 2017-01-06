package com.edu.ResturantManagement;

/**
 * Created by vibs on 1/5/17.
 */
public class Restaurant {
    private final String name_;
    private final String cuisine_ = null;

    public Restaurant(String name_) {
        this.name_= name_;
        this.cuisine_ = cuisine_;
    }
    public void DescribeRestaurant() {
        System.out.println("Name of Restaurant: " + name_);
        for (cuisine_ c: cuisine_) {
            c.printDescrpition();
        }
    }
}

