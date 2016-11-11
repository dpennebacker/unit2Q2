package com.company;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[] { new Student(3.2),
                new Student(4.0), new Student(2.1), new Student(3.5),
                new Student(1.9), new Student(2.5), new Student(3.1),
                new Student(2.4), new Student(2.9), new Student(2.8),
                new Student(3.0), new Student(2.6) };

        HighSchoolClass hsc = new HighSchoolClass(students);

        System.out.println(hsc.getValedictorian().getGPA());
        System.out.println(hsc.getHonorsPercentage());
    }
}
