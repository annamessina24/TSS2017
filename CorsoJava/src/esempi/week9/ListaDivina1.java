package esempi.week9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class ListaDivina1 {
	
	public static void main(String[] args){
		
		try {
			
			Scanner file_input = new Scanner(new BufferedReader(new FileReader("test_files/canto1.txt")));
			
			Vector<String> vettore = new Vector<>();
			Vector<String> vettore2 = new Vector<>();
			HashSet<String> hashset = new HashSet<>();
			TreeSet<String> treeset = new TreeSet<>();
			
			//uso questa roba per verificare l'efficienza
			long startTime = System.currentTimeMillis();
			/**
			//prima scansione del file
			while(file_input.hasNext()){
				
				String s = file_input.next();
				
				//Vector memorizza tutti le stringhe che incontra
				vettore.add(s);
				
				//HashSet aggiunge i dati una sola volta: se dopo un po' incontra
				//di nuovo lo stesso dato, non lo segna
				hashset.add(s);
				
				treeset.add(s);
				
			}
			
			long stopTime = System.currentTimeMillis();
			
			System.out.println("Totale parole: " + vettore.size());
			System.out.println("Totale parole diverse: " + hashset.size());
			System.out.println("Tempo impiegato (in millisecondi): " + (stopTime - startTime));
			*/
			long startTime2 = System.currentTimeMillis();
			
			//seconda scansione del file
			while(file_input.hasNext()){
				
				String s = file_input.next();
				
				if(!vettore2.contains(s)){
				
					vettore2.add(s);
					
				}
			
			}
			
			long stopTime2 = System.currentTimeMillis();
			
			System.out.println("Totale parole diverse: " + vettore2.size());
			System.out.println("Tempo impiegato (in millisecondi): " + (stopTime2 - startTime2));
			
			for(String str: vettore2){
				
				System.out.println(str);
				
			}
			
			file_input.close();
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
