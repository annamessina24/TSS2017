package controller;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import model.*;

public class ProdottiLinkedList {
	
	//questo è il controllar che fornisce i dati
	//creo l'ArrayList dei prodotti e lo scorro (con il metodo apposito)
	private static LinkedList<Abito> prodotti;
	private static StringBuilder s = null;
	
	static{
		
		prodotti = new LinkedList<>();
		
		prodotti.add(new Giacca(Taglie.L, Colori.BLUE, 59.90));
		prodotti.add(new Scarpe(Taglie.L, Colori.GREEN, 69.90));
		prodotti.add(new Maglione(Taglie.M, Colori.GREEN, 39.90));
		prodotti.add(new Pantalone(Taglie.L, Colori.BLUE, 39.90));
		prodotti.add(new Camicia(Taglie.L, Colori.RED, 29.90));
		
	}

	/**
	 * @return the prodotti
	 */
	public static LinkedList<Abito> getProdotti() {
		return prodotti;
	}

	/**
	 * @return the prodotti
	 */
	public static String getProdottiProvv() {
		
		s = new StringBuilder();
		
		for(Abito a : prodotti){
			//System.out.println(a);
			System.out.println("è una giacca: "+(a instanceof Giacca));
			if(a instanceof Giacca)
				System.out.println(a.descriviProdotto());
			s.append(a.descriviProdotto()); 
			
			
		}
		return s.toString();
	}
	
	public static void main(String[] args){
		display(prodotti);
	}

	public static void display(LinkedList<Abito> collezione) {
		System.out.println("La mia lista di prodotti:");
		
		Collections.shuffle(collezione);
		
		Iterator<Abito> iterator = collezione.iterator();
		
		while(iterator.hasNext()){
			Abito a = iterator.next();
			System.out.println(a.descriviProdotto());
			System.out.println("-----------------------");
		}
	}

}
