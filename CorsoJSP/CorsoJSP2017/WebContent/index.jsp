<%@ page import = "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Prima paginozza</title>
	</head>
	<body>
		<h1>Hello World!</h1>
		
		<%
		
		Date d = new Date();
		out.print(d);
		out.print("<br/>");
		
		int i;
		
		for(i=0; i<=10; i++) {
			out.print("i vale: " + i);
			out.print("<br/>");
		}
		
		
		%>
		sempre caro
		mi fu
		quest'ermo colle
	</body>
	
</html>