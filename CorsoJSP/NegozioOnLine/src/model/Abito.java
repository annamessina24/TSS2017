package model;

public abstract class Abito {
	
	String misura;
	Taglie taglia;
	Colori colore;
	Double prezzo;
	String marca;
	
	public abstract String descriviProdotto();

	/**
	 * @return the misura
	 */
	public String getMisura() {
		return misura;
	}

	/**
	 * @return the taglia
	 */
	public Taglie getTaglia() {
		return taglia;
	}

	/**
	 * @return the colore
	 */
	public Colori getColore() {
		return colore;
	}

	/**
	 * @return the prezzo
	 */
	public Double getPrezzo() {
		return prezzo;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	
}
