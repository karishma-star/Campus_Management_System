package com.campus.app;

import com.campus.model.ScholarshipStudent;
import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input from user
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter the student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the student department: ");
        String department = scanner.next();
        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the mark of subject " + (i + 1));
            marks[i] = scanner.nextInt();
        }
        System.out.print("Enter scholarship percentage: ");
        double scholarshipPercentage = scanner.nextDouble();

        Student student = new ScholarshipStudent(id, name, age, department, marks, scholarshipPercentage);
        student.displayStudentinfo(true);
        Student.displayStudentcount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        scanner.close();


        

        
    }
}