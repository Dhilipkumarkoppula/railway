<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.railway.models.User"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<%
	HttpSession session1 = request.getSession(false);
	User currentUser = (session1 != null) ? (User) session1.getAttribute("currentUser") : null;

	if (currentUser == null) {
		response.sendRedirect(request.getContextPath() + "/auth/login.jsp");
		return;
	}
	%>


	<nav>

		<ul type="none">
			<li><a href="home.jsp">Home</a></li>
			<li><a href ="bookticket.jsp">Book Ticket</a></li>
			<li><a href="dashboard.jsp">Dashboard</a></li>
			<li><a href="../auth/logout.jsp">Logout</a></li>
		</ul>
	</nav>

	<hr>
</body>
</html>