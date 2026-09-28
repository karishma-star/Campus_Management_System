package com.campus.model;
public class ScholarshipStudent extends Student {
    private double scholarshippercentage;
    
    public ScholarshipStudent(int studentId, String studentName, int studentAge, String studentDepartment, int[] studentMarks, double scholarshippercentage) {
        super(studentId, studentName, studentAge, studentDepartment, studentMarks);
        this.scholarshippercentage = scholarshippercentage;
    }


public double getScholarshippercentage() {
        return scholarshippercentage;
    }

    public void setScholarshippercentage(double scholarshippercentage) {
        this.scholarshippercentage = scholarshippercentage;
    }

    @Override 
    public void studentType() {
        System.out.println("This is a scholarship student.");
    }
    @Override 
    public void displayStudentinfo(boolean displayMarks) {
        super.displayStudentinfo(displayMarks);
        System.out.println("Scholarship Percentage: " + scholarshippercentage + "%");
    }
    @Override 
    public void generateReport() {
        System.out.println("scholarship student report card.");
    }
    
    @Override 
    public void eligbleForScholarship() {
        System.out.println("This student is eligible for scholarship.");
    }