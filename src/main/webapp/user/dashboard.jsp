<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file ="common/header.jsp" %>
<h1>User Dashboard</h1>

<table border="1">
    <tr>
        <th>ID</th>
        <td><%= currentUser.getId() %></td>
    </tr>
    <tr>
        <th>Username</th>
        <td><%= currentUser.getUsername() %></td>
    </tr>
    <tr>
        <th>Email</th>
        <td><%= currentUser.getEmail() %></td>
    </tr>
    <tr>
        <th>Mobile Number</th>
        <td><%= currentUser.getMobile_number() %></td>
    </tr>
    <tr>
        <th>Aadhar</th>
        <td><%= currentUser.getAadhar() %></td>
    </tr>
</table>

<form action="edit.jsp" method="get">
    <input type="submit" value="Edit Details">
</form>


</body>
</html>