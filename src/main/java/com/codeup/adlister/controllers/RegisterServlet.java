package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String submittedUsername = request.getParameter("username");
        String submittedEmail = request.getParameter("email");
        String submittedPassword = request.getParameter("password");

            try {
                if(isValidPassword(submittedPassword) && isUsernameAvailable(submittedUsername)) {
                    User user = new User(
                            submittedUsername,
                            submittedEmail,
                            submittedPassword
                    );
                    DaoFactory.getUsersDao().insert(user);
                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
                    request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
                }else{
                    response.sendRedirect("/register");
                }
            } catch (IOException | ServletException e) {
                throw new RuntimeException("Error occurred in doPost on RegisterServlet", e);
            }
    }



        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile



    public static boolean isValidPassword(String password){
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}";
        return password.matches(regex);
    }

    public static boolean isUsernameAvailable(String username){
        return DaoFactory.getUsersDao().findByUsername(username) == null;
    }

}
