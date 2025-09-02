package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeListServlet
 */
@WebServlet("/EmployeeListServlet")
public class EmployeeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void dopost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				System.out.println("EmployeeListServlet Triggered");
				// Forwarding to home.jsp (no logic yet)
		        request.getRequestDispatcher("home.jsp").forward(request, response);
	}   
}
