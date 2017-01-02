package progetti.zaino;

public class Cosa {
	
	private String nome, descrizione;

	public Cosa(String nome, String descrizione) {
		this.nome = nome;
		this.descrizione = descrizione;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		
		return "\nOggetto contenuto: " + this.getNome() + "\nDescrizione dell'oggetto: " + this.getDescrizione();
	}
	
	

}
