package com.leewatterson.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer count = (Integer)(session.getAttribute("count"));
		count += 1;
		session.setAttribute("count", count);
		Integer number = (Integer)(session.getAttribute("number"));
		int guess = Integer.parseInt(request.getParameter("guess"));
		if(guess < number) {
			System.out.println("Too, low. Guess: " + guess + " Number: " + number);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/tooLow.jsp");
		        view.forward(request, response);
		}
		else if(guess > number) {
			System.out.println("Too, high. Guess: " + guess + " Number: " + number);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/tooHigh.jsp");
			view.forward(request, response);
		}
		else if(guess == number) {
			System.out.println("Correct Guess");
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/reset.jsp");
	        view.forward(request, response);
		}
		
//		response.sendRedirect("Home");
//		doGet(request, response);
	}

}
