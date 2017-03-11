package controller;

import java.util.ArrayList;

import model.*;

public class Prodotti {
	
	//questo è il controller che fornisce i dati
	//creo l'ArrayList dei prodotti e lo scorro (con il metodo apposito)
	private static ArrayList<Abito> prodotti;
	private static StringBuilder s = null;
	
	static{
		
		prodotti = new ArrayList<>();
		
		prodotti.add(new Giacca(Taglie.L, Colori.BLUE, 59.90));
		prodotti.add(new Scarpe(Taglie.L, Colori.GREEN, 69.90));
		prodotti.add(new Maglione(Taglie.M, Colori.GREEN, 39.90));
		prodotti.add(new Pantalone(Taglie.L, Colori.BLUE, 39.90));
		prodotti.add(new Camicia(Taglie.L, Colori.RED, 29.90));
		
	}

	/**
	 * @return the prodotti
	 */
	public static ArrayList<Abito> getProdotti() {
		return prodotti;
	}

	/**
	 * @return the prodotti
	 */
	public static String getProdottiProvv() {
		
		s = new StringBuilder();
		
		for(Abito a : prodotti){
			//System.out.println(a);
			System.out.println("� una giacca: "+(a instanceof Giacca));
			if(a instanceof Giacca)
				System.out.println(a.descriviProdotto());
			s.append(a.descriviProdotto()); 
			
			
		}
		return s.toString();
	}
	
	public static void main(String[] args){
		System.out.println(getProdottiProvv());
	}

}
