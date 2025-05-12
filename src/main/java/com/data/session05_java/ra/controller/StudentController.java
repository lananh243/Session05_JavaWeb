package com.data.session05_java.ra.controller;


import com.data.session05_java.ra.model.StudentB2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "StudentController", value = "/StudentController")
public class StudentController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("userName");
        int age =  Integer.parseInt(request.getParameter("age"));
        String address =  request.getParameter("address");

        StudentB2 student = new StudentB2(userName, age, address);
        request.setAttribute("student", student);
        request.getRequestDispatcher("/views/confirmation.jsp").forward(request, response);
    }

    public void destroy() {
    }
}