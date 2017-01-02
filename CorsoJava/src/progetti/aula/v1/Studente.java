package progetti.aula.v1;

import java.util.*;

public class Studente {
	
	/**stato interno della classe Studente*/
	
	String nome;
	String cognome;
	Date dataNascita;
	int eta;
	char genere;
	boolean presente;
	
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

		Studente Anna = new Studente();
		Anna.creaStudente("Anna", "Messina", new Date(1988, 6, 24));
		Anna.stampaSaluto();
		Anna.faiAddizione(10, 15);
		
	}
	
	public void stampaSaluto() {
		
		System.out.println("Ciao da " + nome + " " + cognome + " " + dataNascita.getYear());
	}
	
	public int faiAddizione(int a, int b) {
		int somma = a+b;
		System.out.println(somma);
		return somma;
	}

}
