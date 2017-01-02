package esercizi.week4;

import java.lang.Math;

public class MezziCasuali {

	public static void main(String[] args) {
		
		System.out.println(calcolaFrazione());
		
	}

	public static double calcolaFrazione(){
		
		double n = Math.random();

		if (n >=0.5) n -=0.5;
		return n;
	}

}
