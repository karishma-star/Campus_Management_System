package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    //calculate total marks
    public int calculateTotal(Student student) {
        if (student.getmarks() == null){
            return 0;
        }
        int total = 0;
        for (int mark : marks){
          total += mark;
        }
        return total;
    }
    //calculate average marks

    public double calculateAverageMarks(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int total = calculateTotal(MARKS);
        return (double) total / marks.length;
    }
    //find maximum marks
    public int findMaximumMarks(int[] marks) {
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
    public int findMinimumMarks(int[] marks) {
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
    public char grade(student student) {
        int [] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return 'F';
        }
        int total = calculateTotal(marks);
        int average =(int) calculateAverageMarks(marks);
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    } 
    //pass or fail
    public boolean isPass(student student) {
        int[] marks = student.getmarks();
        if (marks == null || marks.length == 0) {
            return "fail";
        }
        int average = (int) calculateAverage(student);
        if (average >= 40) {
            return "pass";
        } else {
            return "fail";
        }

        //display report card
    public void displayReportCard(student student) {
        System.out.println("Student ID: " + student.getstudentid());
        System.out.println("Student Name: " + student.getstudentname());
        System.out.println("Department: " + student.getdepartment());
            System.out.println("Total Marks: " + calculateTotal(student));
            System.out.println("Average Marks: " + calculateAverageMarks(marks));
            System.out.println("Maximum Marks: " + findMaximumMarks(marks));
            System.out.println("Minimum Marks: " + findMinimumMarks(marks));
            System.out.println("Grade: " + grade(student));
            System.out.println("Result: "  +passorfail(student));

    }


    }




