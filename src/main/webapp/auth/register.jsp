<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>
	 <h2>User Registration</h2>
    <form action ="<%= request.getContextPath() %>/auth/register" method ="post">
        <input type="hidden" name="action"/>
        <label for="id">ID</label><br>
        <input type="number" id="id" name="id"><br>
        <label for="name">userName</label><br>
        <input type="text" id="username" name="username"><br>
        <label for="password">password</label><br>
        <input type="password" id="password" name="password"><br>
        <label for="email">Email</label><br>
        <input type="email" id="email" name="email"><br>
        <label for="phone">Phone</label><br>
        <input type="text" id="phone" name="phone"><br><br>
         <label for="aadhar">Aadhar</label><br>
        <input type="text" id="aadhar" name="aadhar"><br>
        <input type="submit" name="submit" value="register">
    </form>
</body>
</html>