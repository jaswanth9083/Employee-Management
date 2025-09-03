package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/employeeDetails")
public class EmployeeDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final EmployeeDAO dao = new EmployeeDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if (idStr == null) {
            response.sendRedirect("employees");
            return;
        }
        Employee e = dao.findById(Integer.parseInt(idStr));
        if (e == null) {
            request.setAttribute("errorMessage", "Employee not found");
        } else {
            request.setAttribute("employee", e);
        }
        request.getRequestDispatcher("employeeDetails.jsp").forward(request, response);
        System.out.println("EmployeeDetailsServlet (GET) Triggered");
    }

    // Handles the update form POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String department = request.getParameter("department");

        Employee e = new Employee(id, name, department);
        boolean ok = dao.update(e);
        if (ok) {
            response.sendRedirect("employees");
        } else {
            request.setAttribute("errorMessage", "Update failed");
            request.setAttribute("employee", e);
            request.getRequestDispatcher("employeeDetails.jsp").forward(request, response);
        }
        System.out.println("EmployeeDetailsServlet (POST update) Triggered");
    }
}
