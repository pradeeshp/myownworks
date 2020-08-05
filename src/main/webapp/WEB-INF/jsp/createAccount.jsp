<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05-08-2020
  Time: 00:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
<form:form  modelAttribute="newaccount">
    <form:input path="firstName" /> 
    <form:input path="lastName"/>
    <form:input path="address"/>
    <form:input path="email"/>
    <input type="submit" value="Create" />
</form:form>
</body>
</html>
