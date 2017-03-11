<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrazione</title>
</head>
<body>

	<h1>Richiesta di registrazione da parte di:</h1>
	
	<h3>Username: <%= request.getParameter("username") %> </h3>
	<h3>Password: ${param.password} </h3>
	<h3>Genere: ${param.genere}</h3>
	<h3>Fascia d'età: ${param.eta}</h3>
	<h3>Forma di pagamento:</h3>
	<ul>
		<%
			String[] pagamenti = request.getParameterValues("payment");
			
			for(String temp : pagamenti){
				out.println("<li>" + temp + "</li>");
			}
		
		%>
	</ul>

</body>
</html>