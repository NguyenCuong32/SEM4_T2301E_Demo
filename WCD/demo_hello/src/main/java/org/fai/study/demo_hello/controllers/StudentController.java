package org.fai.study.demo_hello.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "/student")
public class StudentController extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.getRequestDispatcher("views/student/index.jsp").forward(req, resp);
        }
       catch (ServletException e) {
            e.printStackTrace();
       }
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    public void destroy() {}
}
