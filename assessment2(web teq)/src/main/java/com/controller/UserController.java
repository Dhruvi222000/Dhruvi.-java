package com.controller;

import com.bean.User;
import com.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user") 
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao = new UserDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action) {
            case "register":
                registerUser(request, response);
                break;
            case "login":
                loginUser(request, response);
                break;
            case "checkEmail":
                checkEmail(request, response);
                break;
            case "forgotPassword":
                // Handle forgot password logic
                break;
            case "changePassword":
                // Handle change password logic
                break;
            default:
                response.sendRedirect("index.jsp");
        }
    }

    private void registerUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = new User();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setEmail(request.getParameter("email"));
        user.setMobile(request.getParameter("mobile"));
        user.setAddress(request.getParameter("address"));
        user.setGender(request.getParameter("gender"));
        user.setPassword(request.getParameter("password"));

        if (userDao.registerUser(user)) {
            request.getSession().setAttribute("message", "Registration successful!");
            response.sendRedirect("login.jsp");
        } else {
            request.getSession().setAttribute("error", "Email already registered.");
            response.sendRedirect("signup.jsp");
        }
    }

    private void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = userDao.validateUser(email, password);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("index.jsp");
        } else {
            request.getSession().setAttribute("error", "Invalid email or password.");
            response.sendRedirect("login.jsp");
        }
    }

    private void checkEmail(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        boolean exists = userDao.isEmailRegistered(email);
        
        response.setContentType("application/json");
        response.getWriter().write("{\"exists\":" + exists + "}");
    }
}
