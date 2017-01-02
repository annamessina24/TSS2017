package esempi.week4;

import java.util.Scanner;

public class ContrarioMauro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scrivi una frase: ");

		String s = sc.nextLine();
		
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
