package giochi;

public class CercaIl7 {
	
	public static void main(String[] args){
		
		int vittorie = 0;
		int numeroLanci = 0;
		double successi = 0.0;
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		for(int i=0; i<100; i++){
			numeroLanci++;
			
			d1.lancia();
			d2.lancia();
			
			if((d1.faccia+d2.faccia)==7) {
				vittorie++;
				System.out.println("Dado 1: " + d1.faccia + "\t" + "Dado 2: " + d2.faccia + "\t Hai vinto!");
			}
			else System.out.println("Dado 1: " + d1.faccia + "\t" + "Dado 2: " + d2.faccia);
			
		}
		
		successi=(double)vittorie/(double)numeroLanci;
		
		System.out.println("Vittorie totali: " + vittorie);
		System.out.println("La percentuale di successo è: " + (successi));
		
	}

}
