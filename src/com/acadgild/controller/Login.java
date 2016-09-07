/*
 * Servlet that calls the check User method from the Validate Class to validate the user credentials against the Database
 * If credential are correct redirects to Welcome page else Displays the message invalid credentials on the JSP page 
 * 
 */


package com.acadgild.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        //Calls checUser Method from Validate class to validate the credentials
        if(Validate.checkUser(email, pass))
        {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome1");
            rs.forward(request, response);
        }
        else
        {
        	out.println("Invalid Username or Password ");
           RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
           rs.include(request, response);
           
        }
    }  
}