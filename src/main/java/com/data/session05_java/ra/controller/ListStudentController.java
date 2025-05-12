package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.model.Student;
import com.data.session05_java.ra.service.StudentService;
import com.data.session05_java.ra.service.StudentServiceImp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ListStudentController", value = "/bt4")
public class ListStudentController extends HttpServlet {
    private List<Student> students =  new ArrayList<>();

    @Override
    public void init() throws ServletException {
        students.add(new Student(1, "Nguyen Van A", 20, "Ha Nam"));
        students.add(new Student(2, "Tran Thi B", 23, "Ha Noi"));
        students.add(new Student(3, "Nguyen Van C", 24, "Ha Tinh"));
        students.add(new Student(4, "Nguyen Van Du", 25, "Nghe An"));

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", students);
        request.getRequestDispatcher("/views/listStudent.jsp").forward(request, response);
    }

    public void destroy() {
    }
}