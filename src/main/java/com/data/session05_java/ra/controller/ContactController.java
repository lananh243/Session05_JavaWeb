package com.data.session05_java.ra.controller;

import com.data.session05_java.ra.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ContactController", value = "/contacts")
public class ContactController extends HttpServlet {
    private static List<Contact> contactList = new ArrayList<>();
    private static int idCounter = 1;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");

        if (action == null || action.equals("list")) {
            request.setAttribute("contacts", contactList);
            request.getRequestDispatcher("/views/contactList.jsp").forward(request, response);
        } else if (action.equals("add")) {
            request.getRequestDispatcher("/views/contactForm.jsp").forward(request, response);
        } else if (action.equals("edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            for (Contact contact : contactList) {
                if (contact.getId() == id) {
                    request.setAttribute("contact", contact);
                    break;
                }
            }
            request.getRequestDispatcher("/views/contactForm.jsp").forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action.equals("create")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            contactList.add(new Contact(idCounter++, firstName, lastName, email, phone));
            response.sendRedirect("/contacts");
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            for (Contact contact : contactList) {
                if (contact.getId() == id) {
                    contact.setFirstName(request.getParameter("firstName"));
                    contact.setLastName(request.getParameter("lastName"));
                    contact.setEmail(request.getParameter("email"));
                    contact.setPhone(request.getParameter("phone"));
                    break;
                }
            }
            response.sendRedirect("/contacts");
        } else if (action.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            contactList.removeIf(contact -> contact.getId() == id);
            response.sendRedirect("/contacts");
        }
    }

}