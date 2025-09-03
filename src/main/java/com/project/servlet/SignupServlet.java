package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final UserDAO userDAO = new UserDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("SignUpServlet Triggered");

        User u = new User(
                request.getParameter("FirstName"),
                request.getParameter("LastName"),
                request.getParameter("Gmail"),
                request.getParameter("Password")
        );

        if (userDAO.create(u)) {
            request.setAttribute("infoMessage", "Signup successful. Please log in.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Signup failed (email may already exist).");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
    }
}
