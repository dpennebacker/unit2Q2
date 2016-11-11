package com.company;

/**
 * Created by dpennebacker on 11/10/16.
 */
public class Student {

    Student(double grade){
        gpa = grade;
    }

    public double getGPA()
    {
        return gpa;

    }

    public boolean isHonors()
    {
        return gpa > 3.0;

    }
    double gpa;

}

