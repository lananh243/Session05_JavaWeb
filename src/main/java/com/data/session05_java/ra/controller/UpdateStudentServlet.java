package com.data.session05_java.ra.controller;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "UpdateStudentServlet", value = "/update_student")
public class UpdateStudentServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id =  Integer.parseInt(request.getParameter("id"));
        String studentName =  request.getParameter("studentName");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");


    }

    public void destroy() {
    }
}