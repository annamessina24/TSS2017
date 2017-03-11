package controller;

import java.util.ArrayList;
import java.util.Date;

import model.*;

public class Prodotti {
	
	private static ArrayList<Libro> libri = new ArrayList<>();
	
	public void aggiungiRomanzo(String autore, String titolo, String casaEditrice, Date dataPubblicazione, double prezzo){
		
		Romanzo l = new Romanzo(autore, titolo, casaEditrice, dataPubblicazione, prezzo);
		libri.add(l);
		
	}
	
	public void elencoLibri(){
		
		for (Libro l : libri) {
			
			System.out.println(l.descriviLibro());
			
		}
		
	}

}
