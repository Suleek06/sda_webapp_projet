<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <title>Login form</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <div>
            <div>Name:</div>
            <div><input type="text" name="user_name_field"></div>
        </div>
        <div>
            <div>Name:</div>
            <div><input type="text" name="user_surname_field"></div>
        </div>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>