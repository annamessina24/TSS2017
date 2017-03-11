package model;

import java.util.Date;

public abstract class Libro {
	
	String autore;
	String titolo;
	String casaEditrice;
	Date dataPubblicazione;
	double prezzo;
	
	public abstract String descriviLibro();

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}

	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}

	public Date getDataPubblicazione() {
		return dataPubblicazione;
	}

	public void setDataPubblicazione(Date dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}
