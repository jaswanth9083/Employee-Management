package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				System.out.println("SignUpServlet Triggered");
				
				//get parameters from signUp.jsp
				String firstName = request.getParameter("FirstName");
				String lastName = request.getParameter("LastName");
				String gmail = request.getParameter("Gmail");
				String password = request.getParameter("Password");
				
				//for now just to print
				System.out.println("User: " + firstName + " " + lastName + " | Gmail: " + gmail + " | password: " + password);
				
				//redirect to home.jsp
				response.sendRedirect("home.jsp");
	}

}
