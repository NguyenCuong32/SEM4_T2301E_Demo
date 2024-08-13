package org.fai.study.demo_hello.controllers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.fai.study.demo_hello.Entity.ClassRoom;

import java.io.IOException;
@WebServlet("/classroom")
public class ClassRoomController extends HttpServlet {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    @Override
    public void init(){
        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            var classRooms = entityManager.createStoredProcedureQuery("getClassRoom", ClassRoom.class).getResultList();
            req.setAttribute("classRooms", classRooms);
            req.getRequestDispatcher("views/class/classroom.jsp").forward(req, resp);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
