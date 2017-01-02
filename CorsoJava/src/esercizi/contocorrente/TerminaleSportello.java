package esercizi.contocorrente;

import java.util.Scanner;

public class TerminaleSportello {
	
	private String nomeUtente;
	private String cognomeUtente;
	private String parolaChiave;
	
	Scanner sc = new Scanner(System.in);
	
	public TerminaleSportello(Utente[] elencoUtenti){
		
		
	}
	
	public void Login(){
		
		System.out.println("Inserire nome utente e password:");
		nomeUtente = sc.nextLine();
		cognomeUtente = sc.nextLine();
		parolaChiave = sc.nextLine();
		
	}

}
