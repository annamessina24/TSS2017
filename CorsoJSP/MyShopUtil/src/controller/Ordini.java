package controller;

import java.util.ArrayList;

import model.*;

public class Ordini {
	
	ArrayList<Ordine> ordini;
	
	{
		ordini = new ArrayList<>();
		Pantalone p = new Pantalone(Taglie.M, Colori.BLUE, 39.90);
		ordini.add(new Ordine(p, 2));
	}
	
	public Ordini() {
		System.out.println("Ordine creato.");
	}

	public void inserisciProdotto(Abito a, int i){
		
		this.ordini.add(new Ordine(a, i));
		System.out.println("Prodotto inserito!");
		
	}
	
	public ArrayList getOrdini() {
		
		ArrayList<String> scontrino = new ArrayList<>();
		
		for (Ordine o : ordini) {
			scontrino.add(o.tipoAbito.descriviProdotto() + " " + o.quantita);
		}
		
		return scontrino;
		
	}

	public String stampaOrdine(){
		
		/*class messaggioAugurale{
			
			public void messaggio(String s){
				System.out.println("Grazie e arrivederci!" + s);
			}
			
		}*/
		
		String s = null;
		
		for (Ordine ordine : ordini) {
			s += ordine.tipoAbito + " " + ordine.quantita + "\n";
		}
		
		//messaggioAugurale messaggio = new messaggioAugurale();
		//messaggio.messaggio();
		
		//è più sensato usarlo così perché mantiene maggiormente fede alla natura della classe membro
		//nasce e muore con il metodo in cui è inclusa
		//new messaggioAugurale().messaggio(" Punto vendita le Gru.");
		
		//ma a questo punto, a che mi serve creare un tipo di dato apposta?
		//tanto vale creare semplicemente un nuovo oggetto generico e aggiungere le cose che mi servono
		//--> ANONYMOUS INNER CLASS
		new Object(){
			public void messaggio(String s){
				System.out.println("Grazie e arrivederci!" + s);
			}
		}.messaggio(" Punto vendita Auchan.");
		//creo il metodo direttamente sull'oggetto e lo eseguo subito: si può fare
		
		return s;
		
	}
	
	public double totaleOrdine(){
		
		double totale = 0.0;
		
		for (Ordine ordine : ordini) {
			totale += (ordine.quantita)*(ordine.tipoAbito.getPrezzo());
		}
		
		return totale;
		
	}

	class Ordine{
	
		private Abito tipoAbito;
		private int quantita;

		
		public Ordine(Abito tipoAbito, int quantita) {
			
			this.tipoAbito = tipoAbito;
			this.quantita = quantita;
			
		}
		
	}
	
	public static void main(String[] args){
		
		Ordini mioOrdine = new Ordini();
		System.out.println(mioOrdine.stampaOrdine());
		mioOrdine.inserisciProdotto(new Giacca(Taglie.S, Colori.GREEN, 10.00), 1);
		System.out.println(mioOrdine.stampaOrdine());
		
		Ordini mioOrdine2 = new Ordini();
		System.out.println(mioOrdine2.stampaOrdine());
		mioOrdine2.inserisciProdotto(new Pantalone(Taglie.S, Colori.GREEN, 10.00), 1);
		mioOrdine2.inserisciProdotto(new Maglione(Taglie.L, Colori.GREEN, 10.00), 1);
		System.out.println(mioOrdine2.stampaOrdine());
		
	}
	
}
