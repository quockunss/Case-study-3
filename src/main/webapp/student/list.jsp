<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student Management Application</title>
</head>
<style>
    h1 { color: #ffffff; font-family: 'Raleway',sans-serif; font-size: 62px; font-weight: 800; line-height: 72px; margin: 0 0 24px; text-align: center; text-transform: uppercase; }
    h2 { color: #ffffff; font-family: 'Raleway',sans-serif; font-size: 31px; font-weight: 800; line-height: 36px; margin: 0 0 24px; text-align: center; text-transform: uppercase; }
    input[type=text], input[type=password] {
        margin: 5px;
        padding: 0 10px;
        width: 200px;
        height: 34px;
        color: #404040;
        background: white;
        border: 1px solid;
        border-color: #c4c4c4 #d1d1d1 #d4d4d4;
        border-radius: 2px;
        outline: 5px solid #eff4f7;
        -moz-outline-radius: 3px;
        -webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
        box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
    }
</style>
<body style="background: url(https://image.freepik.com/vector-gratis/diseno-fondo-efecto-luz-neon-dorado-stylight_1017-27095.jpg) no-repeat;background-size: 100%" >
<div style="text-align: center;">
    <h1 style="color: #f8f9fa">Student Management</h1>
    <h2>
        <a href="/student?action=create" class="btn badge-success">Add New Student</a>
    </h2>
</div>
<div align="center">
    <table class="table table-striped table-dark">
        <h2 style="color: #f8f9fa">List of Students</h2>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>date of birth</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="student" items="${listStudent}">
            <tr>
                <td><c:out value="${student.id}"/></td>
                <td><a href="/student?action=detail&id=${student.id}"><c:out value="${student.name}"/></a></td>
                <td><c:out value="${student.email}"/></td>
                <td><c:out value="${student.phoneNumber}"/></td>
                <td><c:out value="${student.dateOfBirth}"/></td>
                <td>
                    <a href="/student?action=edit&id=${student.id}" class="btn btn-warning">Edit</a>
                    <a href="/student?action=delete&id=${student.id}" class="btn btn-danger">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>