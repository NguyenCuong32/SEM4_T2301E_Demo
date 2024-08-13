package org.fai.study.demo_hello.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/product")
public class ProductController extends HttpServlet {
    public void init() throws ServletException {

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.getRequestDispatcher("views/product/index.jsp").forward(req, resp);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
