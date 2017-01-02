package esercizi.week3;

import java.util.Scanner;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Quanti numeri vuoi inserire? ");
		int numeri = in.nextInt();

		int controllo = 0;

		for (int i = 0; i < numeri; i++) {
			System.out.print("Scrivi un numero: ");
			int n = in.nextInt();

			if (n >= 0 && n % 2 == 0)
				controllo++;
		}

		if (controllo == numeri)
			System.out.println("Tutti positivi e pari.");
		else
			System.out.println("Non sono tutti positivi e pari.");

	}
}
