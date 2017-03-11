var carrello = document.getElementById('carrello');
var login = document.getElementById('login');
var registrazione = document.getElementById('registrazione');
var btnSwitchElementi = document.getElementById('switchElementi');

var arrayTest = ["ciao", "mondo"];

carrello.style.display = "none";
registrazione.style.display = "none";

btnSwitchElementi.addEventListener('click', function(){
	if(login.style.display != "none"){
		login.style.display = "none";
		registrazione.style.display = "block";
		btnSwitchElementi.innerHTML = "Login";
	} else {
		login.style.display = "block";
		registrazione.style.display = "none";
		btnSwitchElementi.innerHTML = "Registrati";
	}
});

