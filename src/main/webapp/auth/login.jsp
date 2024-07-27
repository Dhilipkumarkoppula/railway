<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

<h1>Login Page</h1>

<form action="<%= request.getContextPath() %>/auth/login" method="post">
    Username: <input type="text" name="username" required/><br/>
    Password: <input type="password" name="password" required/><br/>
    <input type="submit" name="submit" value="Login"/>
</form>

<%
    String errorMessage = (String) request.getAttribute("errorMessage");
    if (errorMessage != null) {
%>
    <p style="color:red;"><%= errorMessage %></p>
<%
    }
%>

</body>
</html>
