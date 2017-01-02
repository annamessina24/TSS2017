package esempi.week4;

import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {
		
		String input;
		StringBuilder s1 = new StringBuilder();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Scrivi una frase: ");
		input = in.nextLine();
		s1.append(input);
		System.out.println("La tua frase al contrario si legge: " + s1.reverse());
		
	}

}
