<%@ page import="java.util.List" %>
<%@ page import="org.fai.study.demo_hello.Entity.ClassRoom" %><%--
  Created by IntelliJ IDEA.
  User: cuongnguyen
  Date: 12/08/2024
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Class room</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<header>
    <%@ include file="../../include/header.jsp" %>
</header>
<body>
<div>
    <h3>Add classroom</h3>
    <form action="classroom" method="post">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Class name</span>
            </div>
            <input type="text" id="class_name" name="class_name" class="form-control" aria-label="Class name" aria-describedby="inputGroup-sizing-default">
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Number</span>
            </div>
            <input type="number" id="number_member" name="number_member" class="form-control" aria-label="Number" aria-describedby="inputGroup-sizing-default">
        </div>
        <button class="btn btn-primary" type="submit">Save</button>
        <button class="btn btn-secondary" type="button">Reset</button>
    </form>
</div>
<table class="table">
    <thead>
    <th>Id</th>
    <th>Class Name</th>
    <th>Number</th>
    </thead>
    <tbody>
    <%
        List<ClassRoom> classRooms = (List<ClassRoom>) request.getAttribute("classRooms");
        for (ClassRoom classRoom : classRooms) {
    %>
    <tr role="row">
        <td><%= classRoom.getId()%></td>
        <td><%=classRoom.getClass_name()%></td>
        <td><%=classRoom.getNumber_member()%></td>
    </tr>
    <%
        }%>
    </tbody>
</table>
</body>
</html>
