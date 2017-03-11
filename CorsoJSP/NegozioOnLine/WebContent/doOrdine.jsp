<%@ page import="controller.*" %>
<%@ page import="model.*" %>

<% 

if(request.getParameter("giacca").length() > -1) {

	int n_giacca = Integer.parseInt(request.getParameter("giacca"));
	int n_camicia = Integer.parseInt(request.getParameter("camicia"));
	int n_maglione = Integer.parseInt(request.getParameter("maglione"));
	int n_pantalone = Integer.parseInt(request.getParameter("pantalone"));
	int n_scarpe = Integer.parseInt(request.getParameter("scarpe"));
	
	Ordini mOrdine = new Ordini();
	
	if(n_giacca>0)
		mOrdine.inserisciProdotto(new Giacca(Taglie.M, Colori.RED, 19.99), n_giacca);
	if(n_camicia>0)
		mOrdine.inserisciProdotto(new Camicia(Taglie.S, Colori.BLUE, 39.99), n_camicia);
	if(n_maglione>0)
		mOrdine.inserisciProdotto(new Maglione(Taglie.XL, Colori.BLUE, 49.99), n_maglione);
	if(n_pantalone>0)
		mOrdine.inserisciProdotto(new Pantalone(Taglie.M, Colori.BLUE, 29.99), n_pantalone);
	if(n_scarpe>0)
		mOrdine.inserisciProdotto(new Scarpe(Taglie.S, Colori.BLUE, 59.99), n_scarpe);

	
	
	for(Object s : mOrdine.getOrdini()){
		out.print(s + "<br/>");
	}
	
	out.print(mOrdine.totaleOrdine());
	
}

%>