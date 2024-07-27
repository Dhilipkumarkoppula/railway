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

@WebServlet("/user/update")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        User currentUser = (session != null) ? (User) session.getAttribute("currentUser") : null;

        if (currentUser == null) {
            response.sendRedirect(request.getContextPath() + "/auth/login.jsp");
            return;
        }

        try {
            String id = request.getParameter("id");
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String mobile_number = request.getParameter("mobile_number");
            String aadhar = request.getParameter("aadhar");

            currentUser.setUsername(username);
            currentUser.setEmail(email);
            currentUser.setMobile_number(mobile_number);
            currentUser.setAadhar(aadhar);

            UserDAO.updateUserDetails(currentUser);

            session.setAttribute("currentUser", currentUser);
            response.sendRedirect(request.getContextPath() + "/user/home.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred while updating. Please try again.");
            request.getRequestDispatcher("/user/edit.jsp").forward(request, response);
        }
    }
}
