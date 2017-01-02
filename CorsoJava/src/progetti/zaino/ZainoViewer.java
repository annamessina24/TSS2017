package progetti.zaino;

import java.util.Scanner;

public class ZainoViewer {

	public static void main(String[] args) {
		
		Zaino zaino = new Zaino("newfeel", "Mauro", 5);
		Scanner input = new Scanner(System.in);
		boolean esci = false;
		
		while(!esci){
			
			System.out.println("Inserisci comando: ");
			String comando = input.next();
			
			if(comando.equals("q")){
				
				esci = true;
				
			}
			
			else if(comando.equals("elenca")){
				
				zaino.elencaCose();
				
			}
			
			else if(comando.equals("metti")){
				
				System.out.println("Scrivi il nome dell'oggetto da inserire: ");
				String nome = input.next();
				System.out.println("Scrivi la descrizione dell'oggetto da inserire: ");
				String descrizione = input.next();
				Cosa c = new Cosa(nome, descrizione);
				
				boolean stato = zaino.inserisciCosa(c);
				
				if(stato)
					System.out.println("Oggetto inserito correttamente!");
				else
					System.out.println("Non ho inserito l'oggetto " + c.getNome() + " perchÈ lo zaino Ë pieno.");
					
				//zaino.inserisciCosa(c);
				
			}
			
			else if(comando.equals("prendi")){
				
				zaino.elencaCose();
				System.out.println("Dammi posizione oggetto da prendere: ");
				int posizione = input.nextInt();
				zaino.prendiCosa(posizione);
				zaino.elencaCose();
				
			}
			
		}
		
		input.close();

	}

}
