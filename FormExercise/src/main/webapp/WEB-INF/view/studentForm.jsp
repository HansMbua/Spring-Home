<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<form:form action="processForm" modelAttribute="student">
    FirstName:
    <br>
    <form:input path="firstName"></form:input>
    <br><br>
    LastName:
    <br>
    <form:input path="lastName" placeholder="lastName"></form:input>
    <br><br>
    Email:
    <br>
    <form:input path="email"></form:input>
    <br><br>
    Phone Number:
    <br>
    <form:input path="phoneNumber"></form:input>
    <br><br>
    Password:
    <br>
    <form:input path="password" type="password"></form:input>
    <br><br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>