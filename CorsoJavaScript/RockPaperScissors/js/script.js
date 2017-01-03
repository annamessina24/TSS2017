var sceltaPC = document.getElementById("scelta_pc");
var risultato = document.getElementById("risultato");
var playAgain = document.getElementById("play_again");

var btnRock = document.getElementById("btn_rock");
var btnPaper = document.getElementById("btn_paper");
var btnScissors = document.getElementById("btn_scissors");

var mossaPC = "";


function btnPlayAgain(){
	console.log('qui implementare logica per resettare il gioco');

	//document.getElementById('scelta_utente').innerHTML = "";

}

function testRock(){
	var sceltaTemp = btnRock.innerHTML;
	console.log('click su ' + sceltaTemp);
	document.getElementById("scelta_utente").innerHTML += "<h1>" + sceltaTemp + "</h1><img src='img/sasso.jpg'>";
	sceltaComputer();
	comparaScelte(sceltaTemp, mossaPC);
}

function testPaper(){
	var sceltaTemp = btnPaper.innerHTML;
	console.log('click su ' + sceltaTemp);
	document.getElementById("scelta_utente").innerHTML += "<h1>" + sceltaTemp + "</h1><img src='img/carta.jpg'>";
	sceltaComputer();
	comparaScelte(sceltaTemp, mossaPC);
}

function testScissors(){
	var sceltaTemp = btnScissors.innerHTML;
	console.log('click su ' + sceltaTemp);
	document.getElementById("scelta_utente").innerHTML += "<h1>" + sceltaTemp + "</h1><img src='img/forbici.jpg'>";
	sceltaComputer();
	comparaScelte(sceltaTemp, mossaPC);
}
/*
function testCompleto(){
	var sceltaTemp = this.innerHTML;
	console.log('click su ' + sceltaTemp);
	document.getElementById("scelta_utente").innerHTML += "<h1>" + sceltaTemp + "</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp, mossaPC);
}
*/
function sceltaComputer(){

	var numeroRandom = Math.random();

	if(numeroRandom<0.34) {mossaPC = "ROCK";}
	else if(numeroRandom<0.67) {mossaPC = "PAPER";}
	else {mossaPC = "SCISSORS";}

	console.log(mossaPC);

	sceltaPC.innerHTML = "<h1>" + mossaPC + "</h1>";

}

function comparaScelte(player1, player2){

	if(player1===player2) risultato.innerHTML = "<h1>Pareggio</h1>";

	//caso 1
	else if (player1==="ROCK" && player2==="SCISSORS") risultato.innerHTML = "<h1>Hai vinto!</h1>";

	//caso 2
	else if (player1==="SCISSORS" && player2==="ROCK") risultato.innerHTML = "<h1>Vince il PC!</h1>";

	//caso3
	else if (player1==="PAPER" && player2==="ROCK") risultato.innerHTML = "<h1>Hai vinto!</h1>";

	else risultato.innerHTML = "<h1>Vince il PC!</h1>";

}



//eventi utente:
	//1. attributo inclick direttamente sill'oggetto HTML

	/*<button onclick="btnPlayAgain()" id="btn_play_again" class="btn_scelta">PLAY AGAIN</button>*/

	//2. evento onclick collegato alla variabile js dell'elemento

	/*
	btnRock.onclick = testRock;
	btnPaper.onclick = testPaper;
	btnScissors.onclick = testScissors;
	*/

	//3. uso del listener

btnRock.addEventListener("click", testRock);
btnPaper.addEventListener("click", testPaper);
btnScissors.addEventListener("click", testScissors);
