package calcolatrice;

public class MathHelper {

	public static double addizione(String s1, String s2) {
		
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		//System.out.println("Operazione addizione eseguita");
		
		return (num1 + num2);
	}

	public static double sottrazione(String s1, String s2) {
		
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		//System.out.println("Operazione sottrazione eseguita");
		
		return (num1 - num2);
	}

	public static double moltiplicazione(String s1, String s2) {
		
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		//System.out.println("Operazione moltiplicazione eseguita");
		
		return (num1 * num2);
	}

	public static double divisione(String s1, String s2) {
		
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		//System.out.println("Operazione divisione eseguita");
		
		return (num1 / num2);
	}

}
