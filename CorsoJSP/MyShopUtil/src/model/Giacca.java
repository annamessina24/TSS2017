package model;

public class Giacca extends Abito {
	
	public Giacca(){}
	
	public Giacca(Taglie taglia, Colori colore, double prezzo){
		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
		
		if(taglia==Taglie.XL && colore==Colori.RED)
			this.prezzo = prezzo*1.5;
	}

	@Override
	public String descriviProdotto() {
		//System.out.println(taglia.descrizione + " " + taglia.misura);
		return "Giacca " + this.taglia + " " + this.colore + " " + this.prezzo;
	}

}
