package com.amar.j2ee;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

//@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException{
		
		PrintWriter writer = response.getWriter();
		writer.println("Dummy Amar");
		System.out.println(request.getParameter("name"));
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException{
		
		PrintWriter writer = response.getWriter();
		writer.println("Dummy Amar");
		System.out.println(request.getParameter("name"));
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		System.out.println("Inside dopost J2eee");
		
		UserValidationService service= new UserValidationService();
		boolean valid= service.validate(request.getParameter("name"),request.getParameter("password"));
		if(valid)
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		else{
			request.setAttribute("errorMessage", "PASSWORD IS INCORRECT");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
			
			
		
	}
	}
	 

