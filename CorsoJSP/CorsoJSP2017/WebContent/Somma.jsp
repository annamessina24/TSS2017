<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Somma di due numeri</title>
</head>
<body>

	<h1>Somma di due numeri</h1>

	<%
		String risultato;
		String valore1 = request.getParameter("valore1");
		String valore2 = request.getParameter("valore2");
		
		try{
			int somma = Integer.parseInt(valore1)+Integer.parseInt(valore2);
			risultato = valore1 + " + " + valore2 + " = " +Integer.toString(somma);
		}catch(Exception e){
			risultato = "Valori numerici errati!";
		}
	
		out.write(risultato);
	%>

</body>
</html>