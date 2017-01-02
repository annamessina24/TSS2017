package esercizi.week4;

public class DoppioUnoDellAltro {

	public static void main(String[] args) {
		int[] confronti = {1, 5, 7, 9, -7, 78, 10, -15, 32, -1};
		boolean verifica = false;
		/*
		confronti = new int[10];
		
		confronti[0] = 1;
		confronti[1] = 5;
		confronti[2] = 3;
		confronti[3] = 0;
		confronti[4] = -6;
		confronti[5] = 2;
		confronti[6] = 345;
		confronti[7] = -1;
		confronti[8] = 0;
		confronti[9] = -1;
		*/
		
		for(int i=0; i<confronti.length-1;i++) {
			for(int j=0; j<confronti.length-1;j++) {
				if(j!=i) {
					if(confronti[i]==(2*confronti[j]) || confronti[j]==(2*confronti[i])) 
						verifica = true;
				}
			}	
		}
		
	
		if(verifica)
			System.out.println("Sì!");
		else
			System.out.println("No!");

	}
}


