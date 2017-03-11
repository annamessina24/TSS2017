<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World!</title>
</head>
<body>
	<h1>Benvenuto!  <% out.print("user"); String test = "test"; %>  </h1>
	<h2><%= test %></h2>
	<div>
	<% 
	int[][] prodotto = new int[4][];
		
		int i, j;
		
		for(i=0; i<4; i++) 
			prodotto[i] = new int[i+1];
		
		for(i=0; i<4; i++)
			for(j=0; j<=i; j++)
				prodotto[i][j] = (i+1)*(j+1);
				out.println(prodotto[0][0] + "<br/>");
		
		for(i=0; i<2; i++)
			out.print(prodotto[1][i] + " ");
			out.println("<br/>");
			
		for(i=0; i<3; i++)
			out.print(prodotto[2][i] + " ");
			out.println("<br/>");
			
		for(i=0; i<4; i++)
			out.print(prodotto[3][i] + " ");
			out.println("<br/>");
				
	%>
	
	</div>
</body>
</html>