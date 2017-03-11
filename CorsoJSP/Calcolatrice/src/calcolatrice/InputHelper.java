package calcolatrice;

import java.util.Scanner;

public class InputHelper {

	public static String getInput(String string) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(string);
		
		return sc.next();
		
	}

}
