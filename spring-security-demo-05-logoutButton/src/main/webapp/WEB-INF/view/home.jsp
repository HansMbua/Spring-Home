<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<%--adding a logout button--%>
<form:form action="${pageContext.request.contextPath}/logout" method="post">

        <input type="submit" value="Logout">
</form:form>


</body>

</html>

