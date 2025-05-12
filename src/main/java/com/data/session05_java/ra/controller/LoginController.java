package com.data.session05_java.ra.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("123456789")) {
            HttpSession session = request.getSession();
            session.setAttribute("user", username);
            response.sendRedirect("/views/infoUser.jsp");
        } else {
            request.setAttribute("error", "Sai tên đăng nhập hoặc mật khẩu!");
            request.getRequestDispatcher("/views/login.jsp").forward(request, response);
        }
    }

}