package esempi.week8;

public class AritmeticaSbagliata {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		double z = 0.0;
		
		try{
			
			z = x/y;
			System.out.println(z);
			
		}
		
		catch(ArithmeticException e){
			
			System.out.println("Hai inserito zero al denominatore, non posso fare la divisione!");
			e.printStackTrace();
			
		}

	}

}
