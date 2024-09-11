package org.fai.study.demo_hello.controllers;

import jakarta.persistence.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.fai.study.demo_hello.entity.ClassRoom;

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
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("_method");
        try {
            if (method.equals("DELETE")) {
                doDelete(req, resp);
            }
            else if (method.equals("PUT")) {
                doPut(req, resp);
            }
            else {
                System.out.println("ClassRoomController doPost");
                var class_name = req.getParameter("class_name");
                Integer number =  Integer.valueOf(req.getParameter("number_member"));

                var classRoom = new ClassRoom();
                classRoom.setClass_name(class_name);
                classRoom.setNumber_member(number);
                entityManager.getTransaction().begin();
                StoredProcedureQuery query = entityManager.createStoredProcedureQuery("INSERT_CLASSROOM");
                query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
                query.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
                query.setParameter(1, class_name);
                query.setParameter(2, number);

                query.executeUpdate();
                entityManager.getTransaction().commit();
            }

       } catch (Exception e) {
           e.printStackTrace();
           entityManager.getTransaction().rollback();
       }
    }
    @Override
    public void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ClassRoomController doPut");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
        entityManager.getTransaction().begin();
        int id = Integer.parseInt(req.getParameter("id"));
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("DELETE_CLASSROOM_BY_ID");
        query.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);
        query.setParameter(1,id);
        query.execute();
        System.out.println("ClassRoomController doDelete");
    }
}
