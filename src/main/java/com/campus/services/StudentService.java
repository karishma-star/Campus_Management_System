package com.campus.services;

import java.util.List;
import java.util.ArrayList;

public class StudentService {
    private static final List<String> students = new ArrayList<>();

    public StudentService() {
        if (students.isEmpty()) {
            students.add("101-Bill-Java");
            students.add("102-John-C++");
            students.add("103-Alice-Python");
        }
    }

    public List<String> getStudents() {
        return students;
    }

    public void addStudent(String name, String course) {
        students.add(String.valueOf(students.size() + 1) + "-" + name + "-" + course);
    }
}