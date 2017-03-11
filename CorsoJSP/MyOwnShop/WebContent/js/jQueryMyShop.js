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

$(document).ready(function(){

	var card = document.getElementById("card");
	var titolo = $(card).children("<h3>");
	var prezzo = $(card).children("<h4>");
	
	$(card).each(function(index){
	
		titolo.empty();
		prezzo.empty();
	
		for (var i = 0; i <= Prodotti.length; i++) {
			titolo.innerHTML = Prodotti[i].Titolo;
			prezzo.innerHTML = Prodotti[i].Prezzo;
		};
		
	});

});