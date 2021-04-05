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
</style>
<body style="background: url(https://image.freepik.com/vector-gratis/diseno-fondo-efecto-luz-neon-dorado-stylight_1017-27095.jpg) no-repeat;background-size: 100%" >
<div style="text-align: center;">
    <h1 style="color: #f8f9fa">Student Management</h1>
    <h2>
        <a class="btn badge-success" href="student?action=students">List All Students</a>
    </h2>
    <caption>
        <h2 style="color: #f8f9fa">
            Student Information
        </h2>
    </caption>
</div>
<div align="center">
    <form action="/student?action=detail" method="post">
        <table class="table table-striped table-dark">
            <c:if test="${student != null}">
                <input type="hidden" name="id" value="<c:out value='${student.id}' />"/>
            </c:if>
            <tr>
                <th style="color: #f8f9fa">Student Name:</th>
                <td>
                    ${requestScope["student"].getName()}
                </td>
            </tr>
            <tr>
                <th style="color: #f8f9fa">Student Email:</th>
                <td>
                    ${requestScope["student"].getEmail()}
                </td>
            </tr>
            <tr>
                <th style="color: #f8f9fa">Student Phone:</th>
                <td>
                    ${requestScope["student"].getPhoneNumber()}
                </td>
            </tr>
            <tr>
                <th style="color: #f8f9fa">Date Of Birth:</th>
                <td>
                    ${requestScope["student"].getDateOfBirth()}
                </td>
            </tr><tr>
            <th style="color: #f8f9fa">Theory Mark:</th>
            <td>
                    ${requestScope["student"].getTheoryMark()}
            </td>
        </tr><tr>
            <th style="color: #f8f9fa">CaseStudy Mark:</th>
            <td>
                    ${requestScope["student"].getCaseStudyMark()}
            </td>
        </tr><tr>
            <th style="color: #f8f9fa">Practice Mark:</th>
            <td>
                    ${requestScope["student"].getPracticeMark()}
            </td>
        </tr><tr>
            <th style="color: #f8f9fa">Module :</th>
            <td>
                ${requestScope["student"].getModule()}
            </td>
        </tr>
            <tr>
                <th style="color: #f8f9fa">classroom :</th>
                <td>
                    ${requestScope["student"].getClassroom().getClassName()}
                </td>
            </tr>
            <tr>
                <th style="color: #f8f9fa">Tutor :</th>
                <td>
                    ${requestScope["student"].getClassroom().getTutor()}
                </td>
            </tr>
            <tr>
                <th style="color: #f8f9fa">Instructor :</th>
                <td>
                    ${requestScope["student"].getClassroom().getInstructor()}
                </td>
            </tr>
            <tr>
                <th style="color: #f8f9fa">Coach :</th>
                <td>
                    ${requestScope["student"].getClassroom().getCoach()}
                </td>
            </tr>
            <tr>
                <th style="color: #f8f9fa">Status :</th>
                <td>
                    ${requestScope["student"].getClassroom().getStatus()}
                </td>
            </tr>
            <tr>
            </tr>
        </table>
    </form>
</div>
</body>
</html>