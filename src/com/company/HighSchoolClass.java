package com.company;

/**
 * Created by dpennebacker on 11/10/16.
 */
public class HighSchoolClass
{
    private Student [] students;

    public HighSchoolClass (Student [] s)
    {
        students = s;
    }
    //constructors and other data fields not shown

    //returns the valedictorian of the class
    public Student getValedictorian()
    {
        double bestGPA = 0;
        Student valedictorian = null;

        for (Student student : students)
        {
            if (student.getGPA() > bestGPA)
            {
                bestGPA = student.getGPA();
                valedictorian = student;
            }
        }

        return valedictorian;
    }

    // returns the percentage of students in the
    // honors program
    public double getHonorsPercentage()
    {
        int numHonors = 0;

        for (Student student : students) {
            if (student.isHonors()) {
                numHonors++;
            }
        }

        return (double) numHonors / students.length;
    }
}
