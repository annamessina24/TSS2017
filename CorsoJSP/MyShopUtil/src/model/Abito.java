package model;

public abstract class Abito implements Comparable<Abito> {
	
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

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Abito a) {
		String s1 = this.getClass().getSimpleName();
		String s2 = a.getClass().getSimpleName();
		return s1.compareTo(s2);
	}
	
}
