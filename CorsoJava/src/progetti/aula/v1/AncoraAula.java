package progetti.aula.v1;

import java.util.Date;
import java.util.Scanner;

public class AncoraAula {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AncoraStudente studente1 = new AncoraStudente("Roberto", "Balzano", 'M');
		AncoraStudente AncoraStudente = new AncoraStudente("Vittorio", "Bellia", 'M');
		AncoraStudente studente3 = new AncoraStudente("Simone", "Bombaci", 'M');
		AncoraStudente studente4 = new AncoraStudente();
		AncoraStudente studente5 = new AncoraStudente();
		AncoraStudente studente6 = new AncoraStudente();
		AncoraStudente studente7 = new AncoraStudente("Anna", "Messina", 'F');
		AncoraStudente studente8 = new AncoraStudente();
		AncoraStudente studente9 = new AncoraStudente();
		AncoraStudente studente10 = new AncoraStudente();
		AncoraStudente studente11 = new AncoraStudente();
		AncoraStudente studente12 = new AncoraStudente();
		AncoraStudente studente13 = new AncoraStudente();
		AncoraStudente studente14 = new AncoraStudente();
		AncoraStudente studente15 = new AncoraStudente();
		AncoraStudente studente16 = new AncoraStudente();
		AncoraStudente studente17 = new AncoraStudente();
		
		AncoraStudente[] elenco = new AncoraStudente[17];
		
		elenco[0] = studente1;
		elenco[1] = AncoraStudente;
		elenco[2] = studente3;
		elenco[3] = studente4;
		elenco[4] = studente5;
		elenco[5] = studente6;
		elenco[6] = studente7;
		elenco[7] = studente8;
		elenco[8] = studente9;
		elenco[9] = studente10;
		elenco[10] = studente11;
		elenco[11] = studente12;
		elenco[12] = studente13;
		elenco[13] = studente14;
		elenco[14] = studente15;
		elenco[15] = studente16;
		elenco[16] = studente17;
		
		for(int i=0; i<elenco.length; i++) {
			elenco[i].stampaSaluto();
			System.out.println("Qual Ë la risposta corretta?");
			String tuaRisposta = sc.next();
			
		}
		
		
		/**
		String[] nomi = {
				"Roberto",
				"Antonio",
				"Angelo",
				"Amedeo",
				"Dario",
				"Barbara",
		};
		
		AncoraStudente[] miaAula; //costruttore di AncoraStudente
		
		miaAula = new AncoraStudente[17];
		
		for(int i=0; i<nomi.length; i++) {
			miaAula[i] = new AncoraStudente(nomi[i], "TEST");
			miaAula[i].stampaSaluto();
			miaAula[i].getNome();
		}
		
		//String[] cognomi;
		
		for(int i=0; i<nomi.length; i++) {
			System.out.println(nomi[i]);
			
		}

		
		
		
		AncoraStudente studente1 = new AncoraStudente(); //metodo costruttore dell'oggetto: creo un nuovo oggetto Studente vuoto
		studente1.creaStudente("Pippo", "Pluto", new Date(1995, 3, 21));
		studente1.stampaSaluto();
		studente1.faiAddizione(23, 42);
		
		AncoraStudente AncoraStudente = new AncoraStudente();
		AncoraStudente.creaStudente("Bambi", "Tippete", new Date(2000, 1, 12));
		AncoraStudente.stampaSaluto();
		AncoraStudente.faiAddizione(45, 54);
		*/
	}

}
