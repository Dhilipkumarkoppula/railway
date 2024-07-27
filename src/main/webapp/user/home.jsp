<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Home</title>
</head>
<body>

<%@ include file="common/header.jsp" %>
<h1>Welcome, <%= currentUser.getUsername() %>!</h1>
<%@ include file="common/footer.jsp" %>
</body>
</html>
