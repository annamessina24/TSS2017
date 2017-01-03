//alert('Hello, World!'); //mostra un messaggio sulla pagine

//commento su una linea
/*
commento su più linee
*/

var titoloPrincipale = document.getElementById("titolo_principale");
var campo1     		 = document.getElementById("campo1");
var campo2     		 = document.getElementById("campo2");
var mioBottone 		 = document.getElementById("mio_bottone");
var risultato  		 = document.getElementById("risultato");

console.log("La variabile tp contiene: " + titoloPrincipale.innerHTML);


console.log('Hello, World!'); //mostra un messaggio solo in console

console.info('Andiamo in pausa!');

var a, b;
a = 5.0; //number
b = 3;
console.info(a*b);

//b = mauro; //stringa

c = true; //boolean
c = false;
c = 3.14;

d = ["uno", "due"]; //array

var e = [
	 {nome : "anna", cognome : "messina"}, //oggetto
	 {nome : "mauro", cognome : "bogliaccino"}
	 ]; //array di oggetti

f = function(){}; //funzione

Math.pow();

function saluta(){
	var saluto_italico = "Ciao";
	console.info(saluto_italico + ' ora me ne vado!');
}
saluta();

//console.log("Provo ad usare la variabile " + saluto_italico);

mioBottone.onclick = function(){
	//alert("Andiamo in pausa!");
	/*
	var somma = parseInt(campo1.value) + parseInt(campo2.value);
	risultato.innerHTML = "test: " + somma;
	*/
	if (campo1.value=="anna" && campo2.value=="12345") 
		risultato.innerHTML = "benvenuta anna!";
	else
		risultato.innerHTML = "login errato! non puoi entrare.";
	};

for(var i=0; i<e.length; i++){
	console.log(e[i].nome);
};