package progetti.aula.v1;

import java.util.Date;

public class AulaGetterSetter {

	public static void main(String[] args) {
		
		String[] nomi = {
				"Roberto",
				"Antonio",
				"Angelo",
				"Amedeo",
				"Dario",
				"Barbara",
		};
		
		StudenteGetterSetter[] miaAula; //costruttore di StudenteGetterSetter
		
		miaAula = new StudenteGetterSetter[17];
		
		for(int i=0; i<nomi.length; i++) {
			miaAula[i] = new StudenteGetterSetter(nomi[i], "TEST");
			miaAula[i].stampaSaluto();
			miaAula[i].getNome();
		}
		
		String[] cognomi;
		
		for(int i=0; i<nomi.length; i++) {
			System.out.println(nomi[i]);
			
		}

		/**
		StudenteGetterSetter StudenteGetterSetter1 = new StudenteGetterSetter(); //metodo costruttore dell'oggetto: creo un nuovo oggetto StudenteGetterSetter vuoto
		StudenteGetterSetter1.creaStudenteGetterSetter("Pippo", "Pluto", new Date(1995, 3, 21));
		StudenteGetterSetter1.stampaSaluto();
		StudenteGetterSetter1.faiAddizione(23, 42);
		
		StudenteGetterSetter StudenteGetterSetter2 = new StudenteGetterSetter();
		StudenteGetterSetter2.creaStudenteGetterSetter("Bambi", "Tippete", new Date(2000, 1, 12));
		StudenteGetterSetter2.stampaSaluto();
		StudenteGetterSetter2.faiAddizione(45, 54);
		*/
	}

}
