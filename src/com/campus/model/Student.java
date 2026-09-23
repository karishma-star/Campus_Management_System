package com.campus.model;

public class Student{
    //Encapsulation - data hiding
    //instance variales
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

//static variables
static int studentscount=0;

//default constructor
pub;ic student(){
    studentcount++;
}

//parameterized constructor
public tudent(int studentid,string studentname,int age,string department,int[] marks){
    this.studentid = studentid;
    this.studentname = studentname;
    this.age = age;
    this.department = department;
    this.marks = marks;
    studentcount++;
}

//getters
public int getstudentid(){
    return studentid;
}
public string getstudentname(){
    return studentname;
}
public int getAge(){
    return age;
}
public string getdepartment(){
    return department;
}
public int[] getmarks(){
    return marks;
}
//setters
public void getStudentid (int studentid){
    this.studentid = studentid;
}
public void setStudentname(String studentname){
    this.studentname = studentname;
}
public void setAge(int age){
    this.age = age;
}
public void setDepartment(String department){
    this.department = department;
}
public void setMarks(int[] marks){
    this.marks = marks;
}

//instance method
public void displayStudentinfo(){
    System.out.println("Student ID: " + studentid);
    System.out.println("Student Name: " + studentname);
    System.out.println("Age: " + age);
    System.out.println("Department: " + department);
}

public void displayStudentinfo(booleam showmarks){
    displayStudentinfo();

    if(showmarks){
        system.out.println("marks: " + java.util.Arrays.toString(marks));
        (marks));
    }    
}
//static method
public static void displayStudentcount(){
    system.out.println("Total number of students: " + studentcount);
}
    return studentcount;
}
}

