package esercizi.week4;

import java.util.Scanner;

public class DueSequenze {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			boolean verifica = false;
			
			String[] s1;
			String[] s2;
			
			s1 = new String[5];
			s2 = new String[5];

			System.out.println("Primo array di stringhe.");
			
			for(int i=0; i<s1.length; i++) {
				System.out.print("Scrivi una parola: ");
				s1[i] = sc.nextLine();
			}

			System.out.println("Secondo array di stringhe.");
			
			for(int j=0; j<s2.length; j++) {
				System.out.print("Scrivi una parola: ");
				s2[j] = sc.nextLine();
			}
			
			for(int i=0; i<s1.length; i++) {
				for(int j=0; j<s2.length; j++) {
					if(s1[i].equals(s2[j])) {
						verifica = true;
						break;
					}
						
				}
			}
			
			if(verifica)
				System.out.println("OK");
			else
				System.out.println("NO");

	}

}
