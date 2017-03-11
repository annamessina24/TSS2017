<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VerificaLogin</title>
</head>
<body>
	
	<% 
		String username = request.getParameter("username"); 
		String password = request.getParameter("password");
		
		if(username.equals("Anna") && password.equals("12345")) {
		
	%>
	
	<h1>Benvenuto!</h1>
	
	<h2>Nome utente: <%= username %></h2>
	<h2>Password: <%= password %></h2>
	
	<%
		}
		else{
	
	%>
	
	<h1>Non hai inserito correttamente username e passord, riprova!</h1>
	
	<%
		}
	
	%>


</body>
</html>