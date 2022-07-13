<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>Student Registration Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>

<body>
<form:form action="processForm" modelAttribute="student">

    First Name (*): <from:input path="firstName"/>
    <form:errors path="firstName"/>
    <br><br>
    Last Name: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>
    Favorite Language:
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>

    <br><br>
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac"/>
    MS Windows <form:checkbox path="operatingSystems" value="MS"/>
    <br><br>

    <input type="submit" value="Submit">

</form:form>


</body>
</html>

