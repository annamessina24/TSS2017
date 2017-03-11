package calcolatrice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calcolatrice {

	public static void main(String[] args) throws IOException {
		
		//try with resources
		//con un try normale dovrei usare la clausola finally per chiudere le risorse dopo il try/catch
		//con try with resources invece ho in contemporanea dichiarazione, inizializzazione E CHIUSURA
		// --> questo nuovo try/catch (Java 8) mi gestisce le risorse in tutto e per tutto
		try(
				
				FileReader fr = new FileReader("operazioni.txt");
				BufferedReader br = new BufferedReader(fr);
				
			) {
			
			String s;
			
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		} 
		
		String s1 = InputHelper.getInput("Inserisci un numero intero: ");
		assert controllaInput(s1);
		String s2 = InputHelper.getInput("Inserisci un altro numero intero: ");
		assert controllaInput(s2);
		String s3 = InputHelper.getInput("Inserisci un operatore algebrico: (+ - * /) ");
		
		double risultato = 0.0;
		
		switch (s3) {
		case "+": 
			risultato = MathHelper.addizione(s1, s2);
			//System.out.println(risultato);
			break;
		case "-": 
			risultato = MathHelper.sottrazione(s1, s2);
			//System.out.println(risultato);
			break;
		case "*": 
			risultato = MathHelper.moltiplicazione(s1, s2);
			//System.out.println(risultato);
			break;
		case "/": 
			risultato = MathHelper.divisione(s1, s2);
			//System.out.println(risultato);
			break;

		default: 
			System.out.println(risultato);
			break;
		}
		
		System.out.println(risultato);

	}

	public static boolean controllaInput(String s1) {
		
		try{
			Integer.parseInt(s1);
			return true;
		} catch(Exception e){
			System.out.println("Tipo input errato!");
			return false;
		}
	}

}
