package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.model.Student;
import com.data.session05_java.ra.service.StudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ListStudentController", value = "/bt4")
public class ListStudentController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentsPerPage = 5; // số lượng sinh viên mỗi trang
        int page = 1;

        // lấy giá trị page từ request nếu có
        String pageParam = request.getParameter("page");
        if (pageParam != null && pageParam.matches("\\d+")) {
            page = Integer.parseInt(pageParam);
        }

        List<Student> allStudents = StudentService.students;
        int totalStudents = allStudents.size();
        int totalPages = (int) Math.ceil((double) totalStudents / studentsPerPage);

        if (page > totalPages) page = totalPages;
        if (page < 1) page = 1;

        int start = (page - 1) * studentsPerPage;
        int end = Math.min(start + studentsPerPage, totalStudents);
        List<Student> pageStudents = allStudents.subList(start, end);

        request.setAttribute("students", pageStudents);
        request.setAttribute("currentPage", page);
        request.setAttribute("totalPages", totalPages);
        request.getRequestDispatcher("/views/listStudent.jsp").forward(request, response);
    }

    public void destroy() {
    }
}