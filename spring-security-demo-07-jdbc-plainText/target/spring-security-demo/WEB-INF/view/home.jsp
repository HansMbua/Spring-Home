<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<header>
    <title>love to code home</title>
</header>

<body>
<h2>welcome to my page</h2>
<hr>
<p>
    welcome this page is  under
</p>

<hr>
User: <security:authentication property="principal.username"/>
<br><br>
Role(s) <security:authentication property="principal.authorities"/>
<hr>

<%--adding the link to the leader meetings page--%>
<security:authorize access="hasRole('MANAGER')">
    <p>
        <a href="${pageContext.request.contextPath}/leaders">leaders meetings</a>
        (only for leaders peeps)

    </p>
</security:authorize>


<%--adding link to system --%>
<security:authorize access="hasRole('ADMIN')">

    <p>
        <a href="${pageContext.request.contextPath}/systems">IT Systems meeting</a>
        (only for Admin only)

    </p>

</security:authorize>

<%--adding a logout button--%>
<form:form action="${pageContext.request.contextPath}/logout" method="post">

        <input type="submit" value="Logout">
</form:form>


</body>

</html>

