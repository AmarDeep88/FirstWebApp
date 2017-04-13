package com.amar;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException{
		
		PrintWriter writer = response.getWriter();
		writer.println("Dummy Amar");
		System.out.println(request.getParameter("name"));
		request.setAttribute("name", request.getParameter("name"));
		
		request.getRequestDispatcher("/WEB-INF/views/FirstJspFile.jsp").forward(request, response);
		
	}
	}
	 

