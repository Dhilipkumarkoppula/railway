<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.railway.models.User" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit User Details</title>
</head>
<body>

<%@ include file="common/header.jsp" %>
<h1>Edit User Details</h1>

<form action="<%= request.getContextPath() %>/user/update" method="post">
    <input type="hidden" name="id" value="<%= currentUser.getId() %>">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" value="<%= currentUser.getUsername() %>"><br/>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="<%= currentUser.getEmail() %>"><br/>
    <label for="mobile_number">Mobile Number:</label>
    <input type="text" id="mobile_number" name="mobile_number" value="<%= currentUser.getMobile_number() %>"><br/>
    <label for="aadhar">Aadhar:</label>
    <input type="text" id="aadhar" name="aadhar" value="<%= currentUser.getAadhar() %>"><br/>
    <input type="submit" value="Update">
</form>

<%@ include file="common/footer.jsp" %>

</body>
</html>
