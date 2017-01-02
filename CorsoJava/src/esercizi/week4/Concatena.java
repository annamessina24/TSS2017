package esercizi.week4;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scrivi una parola: ");
		String s1 = sc.nextLine();
		System.out.println("Scrivi una parola: ");
		String s2 = sc.nextLine();
		System.out.println("Scrivi una parola: ");
		String s3 = sc.nextLine();
		
		String s = unisciStringhe(unisciStringhe(s1, s2), s3);
		System.out.println(s);
		

	}
	
	public static String unisciStringhe(String str1, String str2){
		
		return str1 + "*" + str2;
		
	}

}
