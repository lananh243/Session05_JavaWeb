package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.model.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TaskController", value = "/tasks")
public class TaskController extends HttpServlet {
    private static List<Task> taskList = new ArrayList<>();
    private static int idCounter = 1;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");

        if (action == null || action.equals("list")) {
            request.setAttribute("tasks", taskList);
            request.getRequestDispatcher("/views/taskList.jsp").forward(request, response);
        } else if (action.equals("add")) {
            request.getRequestDispatcher("/views/taskForm.jsp").forward(request, response);
        } else if (action.equals("edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            for (Task task : taskList) {
                if (task.getId() == id) {
                    request.setAttribute("task", task);
                    break;
                }
            }
            request.getRequestDispatcher("/views/taskForm.jsp").forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action.equals("create")) {
            String description = request.getParameter("description");
            String dueDate = request.getParameter("dueDate");
            boolean completed = request.getParameter("completed") != null;
            taskList.add(new Task(idCounter++, description, dueDate, completed));
            response.sendRedirect("tasks");
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            for (Task task : taskList) {
                if (task.getId() == id) {
                    task.setDescription(request.getParameter("description"));
                    task.setDueDate(request.getParameter("dueDate"));
                    task.setCompleted(request.getParameter("completed") != null);
                    break;
                }
            }
            response.sendRedirect("tasks");
        } else if (action.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            taskList.removeIf(task -> task.getId() == id);
            response.sendRedirect("tasks");
        }
    }
}