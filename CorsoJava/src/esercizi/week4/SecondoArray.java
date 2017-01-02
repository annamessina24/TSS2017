package esercizi.week4;

import java.util.Scanner;

public class SecondoArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] uno;
		int[] due;
		int j = 0;
		
		uno = new int[10];
		
		for(int i=0; i<uno.length-1; i++) {
			System.out.print("Scrivi un numero: ");
			uno[i] = sc.nextInt();
			if(uno[i]>=0) j++;
		}
		
		System.out.println("I numeri positivi interi interni al primo array sono:");
		
		System.out.println();
		
		due = new int[j];
		
		for(int x : uno) {
				if(x>=0) {
					for(int m=0; m<due.length-1; m++) {
					due[m] = x;
					}
				}
		}
		
		for(int k=due.length-1; k>0; k--) {
			System.out.println(due[k]);
		}
		/*
		System.out.println();
		
		for(j=0; j<due.length; j++) {
			System.out.println(due[j]);
		}
*/
		System.out.println();
		System.out.println(j);
		
	}

}
