package esempi.week11;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci un numero intero: ");
		int num1 = scan.nextInt();
		
		System.out.print("Ora inserisci un altro numero intero: ");
		int num2 = scan.nextInt();
		
		System.out.println("La loro somma vale " + (num1+num2) + ".");
		
		scan.close();

	}

}
