package com.example.HRManagers.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.HRManagers.entities.User;
import com.example.HRManagers.bol.UserBO;

import javax.servlet.RequestDispatcher;

public class Login extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("txtUserName");
        String userPassword = request.getParameter("txtPassword");
        com.example.HRManagers.ValidData valid = new com.example.HRManagers.ValidData();
        if (userName == null) {
            goPage(request, response, "login.jsp?error=UserName");
        } else if (userPassword == null || !valid.isPassword(userPassword)) {
            goPage(request, response, "login.jsp?error=Password");
        } else {
            User u = new User();
            UserBO ubo = new UserBO();
            u.setUserName(userName);
            u.setUserPassword(userPassword);
            if (ubo.authorization(u)) {
                HttpSession session = request.getSession();
                session.setAttribute("username", u.getUserName());
                goPage(request, response, "EmployeeManager");
            } else {
                goPage(request, response, "login.jsp?error=Error");
            }
        }
    }

    private void goPage(HttpServletRequest request, HttpServletResponse response, String link)
            throws ServletException, IOException {
        RequestDispatcher reqdis = request.getRequestDispatcher(link);
        reqdis.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
