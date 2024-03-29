<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Custom login page</title>
    <style>
        .failed {
            color : red;
        }
    </style>
</head>

<body>
<h3>My Custom login page</h3>

<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
<%--    check to see if the is an error--%>
    <c:if test="${param.error != null}">
        <i class="failed">sorry! You entered invalid userName/password</i>
    </c:if>

    <p>
        User name: <input type="text" name="username"/>
    </p>
    <p>
        password: <input type="password" name="password"/>
    </p>

    <input type="submit" value="Login"/>

</form:form>

</body>

</html>