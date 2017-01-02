package esempi.week3;

import java.util.Scanner;

public class EsempioFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //nb che questo Ë un metodo costruttore
		System.out.print("Quanti numeri vuoi sommare? ");
		
		int numeri = input.nextInt();
		int somma = 0; //variabile da usare come accumulatore
		
		//per i che va da 0 a numeri (escluso)
		for(int i=0; i<numeri; i++) {
			System.out.print("Inserisci il prossimo numero: ");
			int n = input.nextInt();
			somma += n; //aggiorna l'accumulatore
			System.out.println("Fin qui la somma vale: " + somma +".");
		}
		
		System.out.println("La somma totale vale " + somma + ".");
		System.out.println("La media vale " + (somma/numeri) + ".");
		

	}

}
