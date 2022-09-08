<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>Customer Home</title>
    <style><%@include file="/WEB-INF/view/style/login.css"%></style>

</head>

<body>

<div class = "container">
    <h1>Login page </h1>
    <ul>
        <form:form action="processForm" modelAttribute="userData">
        <li>
           <p>username:</p><form:input path="userName"/>
        </li>

            <li>
                <p>password:</p><form:password path="password"/>
            </li>

            <input type="submit" value="Submit"/>


        </form:form>



    </ul>



</div>

</body>

</html>