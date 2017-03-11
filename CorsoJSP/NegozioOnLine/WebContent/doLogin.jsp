<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	<h1>Login</h1>
	
	<%
		if(request.getParameter("username").equals("Anna") && request.getParameter("password").equals("12345")){
			
			%>
			
		<h2>Benvenuto!</h2>
		
		<h3>Username: <%= request.getParameter("username") %> </h3>
		<h3>Password: ${param.password} </h3><%
		
		} else {
			
			out.print("<h2>Non puoi entrare con queste credenziali</h2>");
			
		}
	
	%>
	

</body>
</html>