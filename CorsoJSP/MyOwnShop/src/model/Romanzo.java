package model;

import java.util.Date;

public class Romanzo extends Libro {
	
	public Romanzo(){}
	
	public Romanzo(String _autore, String _titolo, String _casaEditrice, Date _dataPubblicazione, double _prezzo){
		
		this.autore = _autore;
		this.titolo = _titolo;
		this.casaEditrice = _casaEditrice;
		this.dataPubblicazione = _dataPubblicazione;
		this.prezzo = _prezzo;
		
	}

	@Override
	public String descriviLibro() {
		
		return autore + ", " + titolo + ", " + casaEditrice + ", " + dataPubblicazione + ", " + prezzo;
		
	}

}
