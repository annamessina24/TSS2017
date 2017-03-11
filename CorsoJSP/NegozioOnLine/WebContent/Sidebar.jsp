<%@ page import="java.util.ArrayList" %>

<div id="pulsantiServizio">
	<button id="switchElementi" class="btn btn-primary">Registrati</button>
</div>

	<div id="carrello">
	
		<div class="header"><h1>Carrello</h1></div>
	
		<ul id="prodottiCarrello">
			
		</ul>
		
	</div>
	
	<div id="registrazione">
	
		<div class="header"><h1>Registrazione</h1></div>
		
		<form method="post" name="doRegistrazione" action="doRegistrazione.jsp">
		
			username <input type="text" name="username" /><br/>
			password <input type="text" name="password"/><br/><br/>
			
			M: <input type="radio" name="genere" value="M"/>
			F: <input type="radio" name="genere" value="F"/><br/><br/>
		
			<select name="eta">
				<option value="giovane">Giovane (18-35)</option>
				<option value="esperto">Esperto (36-49)</option>
				<option value="maturo">Maturo (50-65)</option>
			</select><br/><br/>
			
			Metodi di pagamento preferiti:<br/>
			Contanti <input type="checkbox" name="payment" value="contanti"><br/>
			Carta di credito <input type="checkbox" name="payment" value="cartadicredito"><br/>
			Paypal <input type="checkbox" name="payment" value="paypal"><br/>
			Bonifico <input type="checkbox" name="payment" value="bonifico"><br/>
			
			<input type="submit" name="invia" value="Registrati">
		
		</form>
		
	</div>
	
	<div id="login">
	
		<div class="header"><h1>Login</h1></div>
	
		<form method="post" name="doLogin" action="doLogin.jsp">
	
			username <input type="text" name="username" /><br/>
			password <input type="text" name="password"/><br/><br/>
			
			<input type="submit" name="btnLogin" id="btnLogin" value="Login">
		
		</form>
	
	</div>