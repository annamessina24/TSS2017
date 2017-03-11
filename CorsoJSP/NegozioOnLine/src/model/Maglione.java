package model;

public class Maglione extends Abito {
	
	public Maglione(){}
	
	public Maglione(Taglie taglia, Colori colore, double prezzo){
		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
		
		if(taglia==Taglie.XL && colore==Colori.RED)
			this.prezzo = prezzo*1.5;
	}

	@Override
	public String descriviProdotto() {
		// TODO Auto-generated method stub
		return "Maglione " + this.taglia + " " + this.colore + " " + this.prezzo;
	}

}
