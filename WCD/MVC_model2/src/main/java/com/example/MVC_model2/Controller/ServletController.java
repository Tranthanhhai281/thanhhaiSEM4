package com.example.MVC_model2.Controller;

import com.example.MVC_model2.Model.ProductFinderBean;
import com.example.MVC_model2.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletControler")
public class ServletController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Step 1
        String keywordData = request.getParameter("name");
        if (keywordData == null || keywordData.trim().isEmpty()) {
            response.sendRedirect("search.jsp?msg=Enter your keyword");
            return;
        }
        //Step 2
        ProductFinderBean finder = new ProductFinderBean();
        finder.setKeyword(keywordData);

        //Step3
        //HttpSession session = request.getSession();
        //session.setAttribute("finder",finder);
        request.setAttribute("finder", finder);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}

