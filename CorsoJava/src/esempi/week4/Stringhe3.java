package esempi.week4;

import java.util.Scanner;

public class Stringhe3 {

	public static void main(String[] args) {
		String s1 = "Ciao";
		s1 = s1 + " mondo!";
		
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		s2.append(" mondo!");
		
		System.out.println(s1);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Componi dei versi: ");
		
		s2.delete(0, s2.length());
		
		String input;
		
		for(int i=0; i<4; i++) {
			input = scanner.nextLine();
			s2.append(input).append("\n");
		}
		
		System.out.println(s2);

	}

}
