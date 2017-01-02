package esempi.week1;

public class GeneraErrore {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		int i=5, j=2, k=0;
		boolean b1;
		
		System.out.println("Il risultato della divisione Ë " + a/b);
		
		// se provo a compilare d‡ Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at esempi.week1.GeneraErrore.main(GeneraErrore.java:10)

		b1 = (i>j) | (i>(j/k));
		
		System.out.println("b1 Ë " + b1);
		
		// stessa cosa
	}

}
