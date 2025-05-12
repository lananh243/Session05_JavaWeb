package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.model.Student;
import com.data.session05_java.ra.service.StudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "EditStudentController", value = "/EditStudentController")
public class EditStudentController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = StudentService.students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        request.setAttribute("student", student);
        request.getRequestDispatcher("/views/editStudent.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");

        for (Student s : StudentService.students) {
            if (s.getId() == id) {
                s.setStudentName(name);
                s.setAge(age);
                s.setAddress(address);
                break;
            }
        }
        response.sendRedirect("bt4");
    }

    public void destroy() {
    }
}