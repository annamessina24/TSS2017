package esercizi.week4;

import java.util.Scanner;

public class Ripeti {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scrivi una frase: ");
		String s = sc.nextLine();
		System.out.println("Ora indica quante volte vuoi che ti stampi a video questa frase: ");
		int n = sc.nextInt();
		
		stampaCopie(s, n);
		
		/*
		for(int i=0; i<n; i++){
			System.out.println(s);
		}
		*/
		
	}
	
	public static void stampaCopie(String s, int n){
		
		if(n<0)
			System.out.println("Errore! I numeri negativi non sono plausibili.");
		else {
			for(int i=0; i<n; i++) {
				System.out.println(s);
			}
		}
		
	}

}
