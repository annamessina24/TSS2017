package esercizi.week4;

import java.util.Scanner;

public class TuttiUguali {
	
	boolean verifica;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Inserisci un numero: ");
		n1 = sc.nextInt();
		System.out.println("Inserisci un numero: ");
		n2 = sc.nextInt();
		System.out.println("Inserisci un numero: ");
		n3 = sc.nextInt();
		
		if(Verifica(n1, n2, n3))
			System.out.println("Sono tutti uguali!");
		else
			System.out.println("Almeno uno è diverso...");

	}
	
	public static boolean Verifica(int x, int y, int z){
		
		return (x==y && y==z);
			
	}

}
