package esempi.week2;

import java.util.Scanner;

public class ScambioVariabili {

	public static void main(String[] args) {
		
		int a, b, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il valore del primo intero: ");
		a = sc.nextInt();
		System.out.print("Inserisci il valore del secondo intero: ");
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);

	}

	
}
