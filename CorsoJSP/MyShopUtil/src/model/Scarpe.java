package model;

public class Scarpe extends Abito {
	
	public Scarpe(){}
	
	public Scarpe(Taglie taglia, Colori colore, double prezzo){
		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
		
		if(colore==Colori.RED)
			this.prezzo = prezzo*1.5;
	}

	@Override
	public String descriviProdotto() {
		// TODO Auto-generated method stub
		return "Scarpe " + this.taglia + " " + this.colore + " " + this.prezzo;
	}

}
