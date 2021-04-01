package com.example.demo.Controller;

import com.example.demo.Model.LoginDA;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        LoginDA loginDA = new LoginDA();
        loginDA.setUsername(username);
        loginDA.setPassword(password);
        try {
            loginDA.createConnection();
            boolean status = loginDA.checkLoginStatement(username, password);
            HttpSession session = request.getSession();
            if (status) {
                session.setAttribute("bean", loginDA);
                response.sendRedirect("admin.jsp");
            } else {
                response.sendRedirect("index.jsp");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
