<h1>content</h1>

<%
	String r = request.getParameter("pagina");
	
try{
	if(r.equals("Corsi"))
		out.print("Corsi");
	else if(r.equals("Studenti"))
		out.print("Studenti");
	else
		out.print("Home");
} catch (Exception e){
	out.print("non va!");
}


%>

<h2><%= r %></h2>
