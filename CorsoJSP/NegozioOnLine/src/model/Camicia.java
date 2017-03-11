package model;

public class Camicia extends Abito {
	
	public Camicia(){}
	
	public Camicia(Taglie taglia, Colori colore, double prezzo){
		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
		
		if(taglia==Taglie.XL && colore==Colori.RED)
			this.prezzo = prezzo*1.5;
	}

	@Override
	public String descriviProdotto() {
		// TODO Auto-generated method stub
		return "Camicia " + this.taglia + " " + this.colore + " " + this.prezzo;
	}

}
