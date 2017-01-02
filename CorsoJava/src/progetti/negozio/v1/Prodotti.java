package progetti.negozio.v1;

public class Prodotti {
	
	private String Nome;
	private double Prezzo;
	
	public Prodotti(String _Nome, double _Prezzo){
		
		this.Nome = _Nome;
		this.Prezzo = _Prezzo;
		
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return Prezzo;
	}

	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(double prezzo) {
		Prezzo = prezzo;
	}

}
