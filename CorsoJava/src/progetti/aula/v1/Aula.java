package progetti.aula.v1;

import java.util.Date;

public class Aula {

	public static void main(String[] args) {

		Studente studente1 = new Studente();
		studente1.creaStudente("Pippo", "Pluto", new Date(1995, 3, 21));
		studente1.stampaSaluto();
		studente1.faiAddizione(23, 42);
		
		Studente studente2 = new Studente();
		studente2.creaStudente("Bambi", "Tippete", new Date(2000, 1, 12));
		studente2.stampaSaluto();
		studente2.faiAddizione(45, 54);
	}

}
