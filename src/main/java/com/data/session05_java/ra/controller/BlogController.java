package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.model.Post;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BlogController", value = "/blog")
public class BlogController extends HttpServlet {
    private static final List<Post> postList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        postList.add(new Post(1, "Giới thiệu Java", "Java là ngôn ngữ lập trình phổ biến...", "Lan Anh", "2025-05-12"));
        postList.add(new Post(2, "Spring Boot cơ bản", "Spring Boot giúp tạo ứng dụng Java dễ dàng hơn...", "Minh Tú", "2025-05-11"));
        postList.add(new Post(3, "JSP và Servlet", "JSP cho phép nhúng Java vào HTML...", "Hoàng Nam", "2025-05-10"));
        postList.add(new Post(4, "Lập trình Python", "Python là một ngôn ngữ dễ học và mạnh mẽ...", "Lê Quang", "2025-05-09"));
        postList.add(new Post(5, "Cơ sở dữ liệu MySQL", "MySQL là hệ quản trị cơ sở dữ liệu phổ biến...", "Nguyễn Anh", "2025-05-08"));
        postList.add(new Post(6, "React JS cơ bản", "React JS giúp xây dựng giao diện web động và hiệu quả...", "Trần Minh", "2025-05-07"));
        postList.add(new Post(7, "Thực hành với Docker", "Docker giúp quản lý và triển khai ứng dụng dễ dàng...", "Phạm Tuấn", "2025-05-06"));
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String idParam = request.getParameter("id");

        if (idParam == null) {
            request.setAttribute("posts", postList);
            request.getRequestDispatcher("/views/blogList.jsp").forward(request, response);
        } else {
            int id = Integer.parseInt(idParam);
            Post selectedPost = null;
            for (Post post : postList) {
                if (post.getId() == id) {
                    selectedPost = post;
                    break;
                }
            }

            if (selectedPost != null) {
                request.setAttribute("post", selectedPost);
                request.getRequestDispatcher("/views/postDetail.jsp").forward(request, response);
            }
        }
    }

    public void destroy() {
    }
}