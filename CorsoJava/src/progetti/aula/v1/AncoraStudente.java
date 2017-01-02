package progetti.aula.v1;

import java.util.*;

public class AncoraStudente {
	
	//stato interno della classe AncoraStudente, contiene attributi (dati)
	
	/**
	 * Incapsulamento 
	 */
	
	private String nome;
	
	private String cognome;
	Date dataNascita;
	int eta;
	char genere;
	boolean presente;
	
	/**
	 * Metodi: operazioni sui dati
	 */
	
	//metodo getter fatto da noi
	public String getNome() {
		return "Sig." + nome;
	}
	
	//metodo setter fatto da noi
	public void setNome(String nuovoNome) {
		nome = nuovoNome;
	}
	
	//metodo getter generato da IDE
	public String getCognome() {
		return cognome;
	}

	//metodo setter generato da IDE
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	//medodi costruttori
	public AncoraStudente() {}
	
	//firma del metodo: NomeClasse(tipo parametro nome_parametro, tipo parametro nome_parametro)
	public AncoraStudente (String _nome, String _cognome) {
		nome = _nome;
		cognome = _cognome;
	}
	
	public AncoraStudente (String _nome, String _cognome, char _genere) {
		nome = _nome;
		cognome = _cognome;
		genere = _genere;
	}
	
	/**Metodo per creare un nuovo studente
	 * @param _nome inserire il nome dello studente
	 * @param _cognome inserire il cognome dello studente
	 */
	
	public void creaStudente(String _nome, String _cognome, Date _dataNascita) {
		
		nome = _nome;
		cognome = _cognome;
		dataNascita = _dataNascita;
		
	}

	public static void main(String[] args) {

		AncoraStudente Anna = new AncoraStudente();
		Anna.creaStudente("Anna", "Messina", new Date(1988, 6, 24));
		Anna.stampaSaluto();
		Anna.faiAddizione(10, 15);
		
	}
	
	public void stampaSaluto() {
		
		System.out.println("Ciao!");
		System.out.println("Sono " + nome + " " + cognome + ".");
		
		if(genere=='M')
			System.out.println("Sono di genere maschile.");
		else
			System.out.println("Sono di genere femminile.");
	}
	
	public int faiAddizione(int a, int b) {
		int somma = a+b;
		System.out.println(somma);
		return somma;
	}

}
