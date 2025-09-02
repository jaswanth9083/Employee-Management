//LoginSevlet.java//

package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple hard-coded authentication for this example.
        // In a real application, you would connect to a database here.
        if ("jashu".equals(username) && "123".equals(password)) {
            // Authentication successful. Create a new session.
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            // Redirect the user to the home page.
            response.sendRedirect("home.jsp");
        } else {
            // Authentication failed. Set an error message and forward back to login.
            request.setAttribute("errorMessage", "Invalid username or password.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
				System.out.println("LoginServlet Triggered");
				
	}
}

		
	
		

