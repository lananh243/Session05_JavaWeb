package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.model.Student;
import com.data.session05_java.ra.model.StudentB2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "InfoStudentController", value = "/InfoStudentController")
public class InfoStudentController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String studentName =  request.getParameter("studentName");
        int age =  Integer.parseInt(request.getParameter("age"));
        String address =  request.getParameter("address");
        String errorMessage = null;

        // Kiểm tra tính hợp lệ
        if (studentName == null || studentName.isEmpty() || address == null || address.isEmpty()) {
            errorMessage = "Tên và địa chỉ không được để trống.";
        } else {
            try {
                if (age <= 0) {
                    errorMessage = "Tuổi phải là một số dương.";
                }
            } catch (NumberFormatException e) {
                errorMessage = "Tuổi phải là một số hợp lệ.";
            }
        }

        if (errorMessage != null) {
            request.setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher("/views/formStudent.jsp").forward(request, response);
        } else {
            StudentB2 student = new StudentB2(studentName, age, address);
            request.setAttribute("student", student);
            request.getRequestDispatcher("/views/confirmation.jsp").forward(request, response);
        }
    }

}