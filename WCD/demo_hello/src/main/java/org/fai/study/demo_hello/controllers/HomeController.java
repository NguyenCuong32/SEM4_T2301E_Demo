package org.fai.study.demo_hello.controllers;

import jakarta.mvc.Controller;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Home", value = "/home")
public class HomeController extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("Init HomeController");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        try {
            /////
            ///
            req.getRequestDispatcher("/views/home/home.jsp").forward(req,resp);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
