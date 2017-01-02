package esercizi.week4;

public class StampaZigZag {

	public static void main(String[] args) {
		
		int[] ordine;
		
		ordine = new int[10];
		
		ordine[0] = 0;
		ordine[1] = 1;
		ordine[2] = 2;
		ordine[3] = 3;
		ordine[4] = 4;
		ordine[5] = 5;
		ordine[6] = 6;
		ordine[7] = 7;
		ordine[8] = 8;
		ordine[9] = 9;
		
		for(int i=0; i<ordine.length/2; i++) {
			System.out.println(ordine[i]);
			System.out.println(ordine[(ordine.length-1)-i]);
		}

	}

}
