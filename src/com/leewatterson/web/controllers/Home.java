package com.leewatterson.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session == null) {
			session = request.getSession();
			Integer count = 0;
			Random rand = new Random();
			Integer number = rand.nextInt(100);
			System.out.println("New session: Number: " + number + " Count: " + count);
			session.setAttribute("count", count);
			session.setAttribute("number", number);
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			view.forward(request, response);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("Home");
	}

}
