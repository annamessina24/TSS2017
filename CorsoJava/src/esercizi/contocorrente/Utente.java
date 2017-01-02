package esercizi.contocorrente;

public class Utente {
	
	private String nome, cognome, password;
	
	public Utente(String nomeUtente, String cognomeUtente, String parolaChiave){
		
		this.nome = nomeUtente;
		this.cognome = cognomeUtente;
		this.password = parolaChiave;
		
	}
	
	public boolean Controlla(String nomeUtente, String cognomeUtente){
		
		return(nome.equals(nomeUtente) && cognome.equals(cognomeUtente));
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
