var Prodotti = [
	{
		"Autore": "Italo Calvino",
		"Titolo": "Le città invisibili", 
		"CasaEditrice": "Einaudi",
		"DataPubblicazione": 1972,
		"Prezzo": 9.99
	},
	{
		"Autore": "J. R. R. Tolkien",
		"Titolo": "Il Signore degli Anelli", 
		"CasaEditrice": "Fanucci",
		"DataPubblicazione": 1955,
		"Prezzo": 39.99
	},
	{
		"Autore": "Ursula K. Le Guin",
		"Titolo": "La mano sinistra delle tenebre", 
		"CasaEditrice": "Mondadori",
		"DataPubblicazione": 1970,
		"Prezzo": 9.99
	},
	{
		"Autore": "Kurt Vonnegut",
		"Titolo": "Mattatoio n. 5", 
		"CasaEditrice": "Feltrinelli",
		"DataPubblicazione": 1962,
		"Prezzo": 7.99
	},
	{
		"Autore": "Kazuo Ishiguro",
		"Titolo": "Non lasciarmi", 
		"CasaEditrice": "Einaudi",
		"DataPubblicazione": 1990,
		"Prezzo": 9.99
	},
	{
		"Autore": "Elena Ferrante",
		"Titolo": "L'amica geniale", 
		"CasaEditrice": "e/o",
		"DataPubblicazione": 2012,
		"Prezzo": 19.99
	},
	{
		"Autore": "Mark Z. Danielewski",
		"Titolo": "Casa di foglie", 
		"CasaEditrice": "Mondadori",
		"DataPubblicazione": 1999,
		"Prezzo": 14.99
	},
	{
		"Autore": "Douglas Adams",
		"Titolo": "Dirk Gently - Agenzia investigativa olistica", 
		"CasaEditrice": "Mondadori",
		"DataPubblicazione": 1995,
		"Prezzo": 8.99
	},
	{
		"Autore": "Haruki Murakami",
		"Titolo": "Norwegian Wood", 
		"CasaEditrice": "Einaudi",
		"DataPubblicazione": 1985,
		"Prezzo": 11.99
	},
	{
		"Autore": "Gore Vidal",
		"Titolo": "Myra Breckinridge", 
		"CasaEditrice": "Fazi",
		"DataPubblicazione": 1972,
		"Prezzo": 14.99
	}
];

function creaCard(p){
	
	var output = "";

	output += "<div class='col-sm-4 col-lg-4 col-md-4'>";
    output +=     "<div class='thumbnail'>";
    output +=         "<img src='http://placehold.it/320x150' alt=''>";
    output +=         "<div id='card' class='caption'>";
    output +=             "<h4 class='pull-right'>" + p.Prezzo + "€</h4>";
    output +=             "<h4><a href='#'>" + p.Titolo + "</a>";
    output +=             "</h4>";
    output +=             "<p>" + p.Autore + ", " + p.CasaEditrice + ", " + p.DataPubblicazione + "</p>"
    output +=         "</div>";
    output +=         "<div class='ratings'>";
    output +=             "<p class='pull-right'>15 reviews</p>";
    output +=             "<p>";
    output +=                 "<span class='glyphicon glyphicon-star'></span>";
    output +=                 "<span class='glyphicon glyphicon-star'></span>";
    output +=                 "<span class='glyphicon glyphicon-star'></span>";
    output +=                 "<span class='glyphicon glyphicon-star'></span>";
    output +=                 "<span class='glyphicon glyphicon-star'></span>";
    output +=             "</p>";
    output +=         "</div>";
    output +=     "</div>";
    output += "</div>";
	
	return output;
	
};

for (var i = 0; i <= Prodotti.length - 1; i++) {
	
	document.getElementById('content').innerHTML += creaCard(Prodotti[i]);
	
	creaCard(Prodotti[i]);
	
	console.log(Prodotti[i].Titolo);
	console.log(Prodotti[i]['Prezzo']);
};