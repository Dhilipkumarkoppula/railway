package com.railway.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.railway.dao.UserDAO;
import com.railway.models.User;

@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Typically, login form would be forwarded here
		request.getRequestDispatcher("/auth/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = null;
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			user = UserDAO.getUserDetails(username, password);
			
			if (user == null) {
				// User not found, redirect back to login page with an error message
				request.setAttribute("errorMessage", "Invalid username or password");
				request.getRequestDispatcher("/auth/login.jsp").forward(request, response);
			} else {
				// User found, create session and set user attribute
				HttpSession session = request.getSession();
				session.setAttribute("currentUser", user);
				response.sendRedirect(request.getContextPath() + "/user/home.jsp"); // Redirect to user home page
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// Handle exceptions and redirect back to login page with an error message
			request.setAttribute("errorMessage", "An error occurred. Please try again.");
			request.getRequestDispatcher("/auth/login.jsp").forward(request, response);
		}
	}
}
