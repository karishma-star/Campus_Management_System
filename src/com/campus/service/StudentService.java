package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    //calculate total marks
    public int calculateTotal(Student student) {
        if (student.getmarks() == null){
            return 0;
        }
        int total = 0;
        for (int mark : student.getmarks()){
          total += mark;
        }
        return total;
    }
    //calculate average marks

    public double calculateAverageMarks(Student student) {
        int[] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int total = calculateTotal(student);
        return (double) total / marks.length;
    }
    //find maximum marks
    public int findMaximumMarks(Student student) {
        int[] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return 0;
        }
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }
    //find minimum marks
    public int findMinimumMarks(Student student) {
        int[] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return 0;
        }
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }
    //grade based on marks
    public char grade(Student student) {
        int [] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return 'F';
        }
        int average = (int) calculateAverageMarks(student);
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    } 
    //pass or fail
    public boolean isPass(Student student) {
        int[] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return false;
        }
        int average = (int) calculateAverageMarks(student);
        if (average >= 40) {
            return true;
        } else {
            return false;
        }
    }
        //display report card
    public void displayReportCard(Student student) {
        System.out.println("Student ID: " + student.getstudentid());
        System.out.println("Student Name: " + student.getstudentname());
        System.out.println("Department: " + student.getdepartment());
            System.out.println("Total Marks: " + calculateTotal(student));
            System.out.println("Average Marks: " + calculateAverageMarks(student));
            System.out.println("Maximum Marks: " + findMaximumMarks(student));
            System.out.println("Minimum Marks: " + findMinimumMarks(student));
            System.out.println("Grade: " + grade(student));
            System.out.println("Result: "  +isPass(student));

    }


    }



