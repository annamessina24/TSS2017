package giochi;

import java.util.Random;

public class Dado {
	
	int facce = 6, faccia;
	String colore = "bianco";
	
	public int lancia(){
		
		Random random = new Random();
		
		this.faccia = (random.nextInt(facce)) + 1;
		return this.faccia;
	}
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
		d1.lancia();
		System.out.println(d1.faccia);
	}
	

}
