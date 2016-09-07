/*
 * Servlet that displays the Welcome page when the user credentials are correct  
 * 
 */

package com.acadgild.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//@WebServlet("/Welcome1")
public class Welcome1 extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Welcome user");
      }  
}