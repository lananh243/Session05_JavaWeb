package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.service.StudentService;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DeleteStudentController", value = "/DeleteStudentController")
public class DeleteStudentController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        StudentService.students.removeIf(student -> student.getId() == id);
        response.sendRedirect("bt4");
    }

}