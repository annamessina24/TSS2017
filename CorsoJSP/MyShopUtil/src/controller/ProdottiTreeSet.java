package controller;

import java.util.TreeSet;

import model.*;

public class ProdottiTreeSet {
	
	private static TreeSet<Abito> prodotti;
	private static StringBuilder s = null;
	
	static{
		
		prodotti = new TreeSet<>();
		
		Pantalone p = new Pantalone(Taglie.M, Colori.BLUE, 39.99);
		
		prodotti.add(new Giacca(Taglie.L, Colori.BLUE, 59.90));
		prodotti.add(new Scarpe(Taglie.L, Colori.GREEN, 69.90));
		prodotti.add(new Maglione(Taglie.M, Colori.GREEN, 39.90));
		prodotti.add(p);
		prodotti.add(p);
		prodotti.add(new Camicia(Taglie.L, Colori.RED, 29.90));
		
	}

	/**
	 * @return the prodotti
	 */
	public static TreeSet<Abito> getProdotti() {
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
		System.out.println(getProdottiProvv());
	}

}
