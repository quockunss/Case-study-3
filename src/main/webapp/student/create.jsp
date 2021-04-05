<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <h1  style="color: #f8f9fa">Student Management</h1>
    <h2>
        <a href="student?action=student" class="btn badge-success ">List All Students</a>
    </h2>
    <caption>
        <h2 style="color: #f8f9fa">Add New Student</h2>
    </caption>
</div>
<div align="center">
    <form method="post">
        <table class="table table-striped table-dark">

            <tr>
                <th>Student Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Student Email:</th>
                <td>
                    <input type="text" name="email" id="email" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Student phone:</th>
                <td>
                    <input type="text" name="phoneNumber" id="phoneNumber" size="45"/>
                </td>
            </tr><tr>
                <th>Student date of birth:</th>
                <td>
                    <input type="text" name="dateOfBirth" id="dateOfBirth" size="45"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input class="btn badge-success" type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>