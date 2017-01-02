package progetti.aula.v1;

import java.util.Date;

public class AulaArray {

	public static void main(String[] args) {
		
		String[] nomi = {
				"Roberto",
				"Antonio",
				"Angelo",
				"Amedeo",
				"Dario",
				"Barbara",
		};
		
		StudenteArray[] miaAula;
		
		miaAula = new StudenteArray[17];
		
		for(int i=0; i<nomi.length; i++) {
			miaAula[i] = new StudenteArray(nomi[i], "TEST");
			miaAula[i].stampaSaluto();
		}
		
		String[] cognomi;
		
		for(int i=0; i<nomi.length; i++) {
			System.out.println(nomi[i]);
			
		}

		/**
		Studente2 studente1 = new Studente2(); //metodo costruttore dell'oggetto: creo un nuovo oggetto Studente vuoto
		studente1.creaStudente("Pippo", "Pluto", new Date(1995, 3, 21));
		studente1.stampaSaluto();
		studente1.faiAddizione(23, 42);
		
		Studente2 studente2 = new Studente2();
		studente2.creaStudente("Bambi", "Tippete", new Date(2000, 1, 12));
		studente2.stampaSaluto();
		studente2.faiAddizione(45, 54);
		*/
	}

}
