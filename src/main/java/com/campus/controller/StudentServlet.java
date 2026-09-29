package com.campus.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.campus.services.StudentService;

@webServlet("/student")
public class StudentServlet extends HttpServlet {

    private final Studentervice studentService = new StudentService();

    @Override 
    public void doget(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Student List</title></head>");
        out.println("<body>");

        out.println("<h1>all students</h1>");
        out.println("<ul>");
        for (String student : studentService.getStudents()) {
            out.println("<li>" + student + "</li>");
        }
        out.println("</ul>");
        out.println("<a href=\"student.html\">Add Student</a>");
        out.println("<body>");
        out.println("</html>");
    }

    @Override 
    public void dopost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String course = request.getParameter("course");z
        studentService.addStudent(name, course);
        response.sendRedirect("/student");
    }
}