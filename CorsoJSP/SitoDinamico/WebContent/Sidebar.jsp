<%@ page import="java.util.ArrayList;" %>

<h1>sidebar</h1>

<%

	ArrayList<String> elenco = new ArrayList<String>();
	elenco.add("Balzano");
	elenco.add("Bellia");
	elenco.add("Bombaci");
	elenco.add("Canal Monteagudo");
	elenco.add("Marzullo");
	elenco.add("Mennillo");
	elenco.add("Messina");
	elenco.add("Minozzi");
	elenco.add("Morabito");
	elenco.add("Nicosia");
	elenco.add("Passannanti");
	elenco.add("Ruggirello");
	elenco.add("Sacchet");
	elenco.add("Sorrentino");
	elenco.add("Triscio");
	elenco.add("Vassallo");
	elenco.add("Zilioli");
	
	for(int i=0; i<elenco.size(); i++){
		out.print("<li><a href=\"#\">" + elenco.get(i) + "</li>");
	}


%>