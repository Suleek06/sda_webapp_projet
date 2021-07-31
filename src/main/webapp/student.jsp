<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 29.07.2021
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>
    <h2>Hello student</h2>
<div>
    <table>
        <thead>
        <th>Id</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Index number</th>
        <th>Birthdate</th>
        </thead>
    </table>

    <c: forEach var="element" items="${param.studentList}">
        <tr>
            <td><c:out value ="${element.id}"/></td>
            <td><c:out value ="${element.firstName}"/></td>
            <td><c:out value ="${element.lastName}"/></td>
            <td><c:out value ="${element.indeks}"/></td>
            <td><c:out value ="${element.birthDate}"/></td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
    </c:>
</div>
</body>
</html>
