package esercizi.week4;

public class TreConsecutivi {

	public static void main(String[] args) {
		
		int[] trova;
		boolean verifica = false; 
		
		trova = new int[10];
		
		trova[0] = 1;
		trova[1] = 5;
		trova[2] = 3;
		trova[3] = 0;
		trova[4] = 2;
		trova[5] = 2;
		trova[6] = 2;
		trova[7] = -1;
		trova[8] = 0;
		trova[9] = -1;
		
		for(int i=0; i<trova.length-1; i++) {
			if(trova[i]==trova[i+1] && trova[i+1]==trova[i+2])
				verifica = true;
		}

		if(verifica)
			System.out.println("Sono presenti tre numeri uguali consecutivi!");
		else
			System.out.println("Non ci sono tre numeri uguali consecutivi...");
	}

}
