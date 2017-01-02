package esercizi.week4;

public class SommaPariDispari {

	public static void main(String[] args) {
		
		int[] somma;
		int sommaPari = 0, sommaDispari = 0;
		
		somma = new int[10];
		
		somma[0] = 1;
		somma[1] = 1;
		somma[2] = 1;
		somma[3] = 1;
		somma[4] = 1;
		somma[5] = 1;
		somma[6] = 1;
		somma[7] = 1;
		somma[8] = 2;
		somma[9] = 1;
		
		for(int i=0; i<somma.length; i++) {
			if(i%2==0)
				sommaPari += somma[i];
			else
				sommaDispari += somma[i];
		}
		
		if(sommaPari==sommaDispari)
			System.out.println("Le due somme sono uguali!");
		else
			System.out.println("Le due somme non sono uguali!");
		
		System.out.println(sommaPari);
		System.out.println(sommaDispari);

	}

}
