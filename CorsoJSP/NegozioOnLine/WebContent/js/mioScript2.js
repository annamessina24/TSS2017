var Prodotti = [
	{
		"Abito"	: "Camicia",
		"Taglia": ["S", "M", "L", "XL"],
		"Colore": ["RED", "BLUE", "GREEN"],
		"Prezzo": 39.99
	},
	{
		"Abito"	: "Pantalone",
		"Taglia": ["S", "M", "L", "XL"],
		"Colore": ["RED", "BLUE", "GREEN"],
		"Prezzo": 59.99
	},
	{
		"Abito"	: "Maglione",
		"Taglia": ["S", "M", "L", "XL"],
		"Colore": ["RED", "BLUE", "GREEN"],
		"Prezzo": 39.99
	},
	{
		"Abito"	: "Giacca",
		"Taglia": ["S", "M", "L", "XL"],
		"Colore": ["RED", "BLUE", "GREEN"],
		"Prezzo": 69.99
	}
];

function creaCard(p){
	
	//con una funzione di questo genere, creo dell'HTML raw
	var output = "";

	output += "<div class='panel panel-default card'>";
	
	output += "<div class='panel-heading'>";
	output += "<h3 class='panel-title'>" + p.Abito + "</h3>";
	output += "</div>";
	
	output += "<div class='panel-body'>";
	output += "<img class='img-responsive img-circle' src='img/" + p.Abito + ".jpg' alt='Immagine di '" + p.Abito + "><br/>";
	output += p.Prezzo + "<br/>";
	output += "</div>";
	
	output += "<div class='panel-footer'>";
	output += "<button class='btn btn-primary'>Aggiungi al carrello</button>";
	output += "</div>";
	
	output += "</div>"
	
	return output;
};

var carrello = document.getElementById('carrello');
var prodottiCarrello = document.getElementById('prodottiCarrello');

function creaCard2(p){
	
	//con una funzione di questo genere, invece, vado a manipolare direttamente il DOM, e sono io a dire dove vadano le cose
	var divCard = document.createElement("div");
	divCard.setAttribute('class', 'panel panel-primary card col-md-4');
	
	var panelHeading = document.createElement("div");
	panelHeading.setAttribute('class', 'panel-heading');
	
	var panelTitle = document.createElement("h3");
	panelTitle.setAttribute('class', 'panel-title');
	
	var panelTitleContent = document.createTextNode(p.Abito);
	
	panelTitle.appendChild(panelTitleContent);
	panelHeading.appendChild(panelTitle);
	divCard.appendChild(panelHeading);
	document.getElementById('content').appendChild(divCard);
	
	var panelContent = document.createElement("div");
	panelContent.setAttribute('class', 'panel-content');
	
	var productImage = document.createElement("img");
	productImage.setAttribute('src', 'img/' + p.Abito + '.jpg');
	productImage.setAttribute('class', 'img-responsive img-circle');
	productImage.setAttribute('alt', p.Abito);
	
	var productPrice = document.createTextNode(p.Prezzo);
	
	panelContent.appendChild(productImage);
	panelContent.appendChild(productPrice);
	divCard.appendChild(panelContent);
	
	var panelFooter = document.createElement("div");
	panelFooter.setAttribute('class', 'panel-footer');
	
	var btnCart = document.createElement("button");
	btnCart.setAttribute('class', 'btn btn-primary');
	//btnCart.setAttribute('onclick', "alert('" + p.Abito + ". Prezzo: " + p.Prezzo + "')");
	//btnCart.setAttribute('onclick', "mettiNelCarrello(" + p + ")");
	
	btnCart.addEventListener('click', function(p){
		var test = document.createTextNode(p.Abito);
		var liTemp = document.createElement("li").appendChild(test);
		carrello.appendChild(liTemp);
	});
	
	var testoBtnCart = document.createTextNode("Aggiungi al carrello");
	
	btnCart.appendChild(testoBtnCart);
	panelFooter.appendChild(btnCart);
	divCard.appendChild(panelFooter);
	
};

function mettiNelCarrello(p){
	var liTemp = document.createElement("li").appendChild(createTextNode(p.Abito));
	carrello.appendChild(liTemp);
};
var login = document.getElementById('login');
var registrazione = document.getElementById('registrazione');
var btnSwitchElementi = document.getElementById('switchElementi');

for (var i = 0; i <= Prodotti.length - 1; i++) {
	
	//document.getElementById('content').innerHTML += creaCard(Prodotti[i]);
	
	creaCard2(Prodotti[i]);
	
	console.log(Prodotti[i].Abito);
	console.log(Prodotti[i]['Prezzo']);
};

//alert(Prodotti);

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

