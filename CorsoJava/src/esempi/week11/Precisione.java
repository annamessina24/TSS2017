package esempi.week11;

import java.math.BigDecimal;

public class Precisione {

	public static void main(String[] args) {
		
		double valore = 0.12;
		
		double sommaValori = valore + valore + valore;
		System.out.println(sommaValori); //perdita di precisione
		
		String valStringa = Double.toString(valore);
		System.out.println(valStringa);
		
		BigDecimal bigValore = new BigDecimal(valStringa);
		//System.out.println(bigValore);
		
		BigDecimal bigSomma = bigValore.add(bigValore).add(bigValore);
		System.out.println(bigSomma); //ora il risultato è preciso

	}

}
