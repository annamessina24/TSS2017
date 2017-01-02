package esercizi.week3;

import java.util.Scanner;

public class TuttiPositiviPariMauro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quanti numeri vuoi inserire? ");
		int numeri = sc.nextInt();

		boolean positiviPari = true;

		for (int i = 0; i < numeri; i++) {
			System.out.print("Scrivi un numero: ");
			int n = sc.nextInt();

			if (n < 0 || n % 2 != 0)
				positiviPari = false;
		}

		if (positiviPari)
			System.out.println("Tutti positivi e pari.");
		else
			System.out.println("Non sono tutti positivi e pari.");

	}

}
