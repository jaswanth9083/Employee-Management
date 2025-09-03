package com.project.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/employees")
public class EmployeeListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final EmployeeDAO dao = new EmployeeDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Simple login guard
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("userEmail") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        List<Employee> employees = dao.findAll();
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("employeeList.jsp").forward(request, response);
        System.out.println("EmployeeListServlet Triggered");
    }
}
