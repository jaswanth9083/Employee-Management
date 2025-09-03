//LoginSevlet.java//

package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final UserDAO userDAO = new UserDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usernameOrEmail = request.getParameter("username"); // using "gmail" here
        String password = request.getParameter("password");

        if (userDAO.authenticate(usernameOrEmail, password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("userEmail", usernameOrEmail);
            response.sendRedirect("employees");
        } else {
            request.setAttribute("errorMessage", "Invalid username or password.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        System.out.println("LoginServlet Triggered");
    }
}

		
	
		

