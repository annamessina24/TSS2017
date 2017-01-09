package esempi.week11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mappa {

	public static void main(String[] args) {
		
		Map<String, String> regioni = new HashMap<>();
		
		regioni.put("Piemonte", "Torino");
		regioni.put("Campania", "Napoli");
		regioni.put("Sicilia", "Palermo");
		
		System.out.println(regioni);
		
		regioni.put("Lazio", "Roma");
		System.out.println(regioni);
		System.out.println();
		
		String capoluogo = regioni.get("Campania");
		System.out.println(capoluogo);
		System.out.println();
		
		Set<String> miaLista = regioni.keySet();
		
		for (String string : miaLista) {
			System.out.print(string + ": ");
			System.out.println(regioni.get(string));
		}
		System.out.println();
		
		Iterator<String> iteratore1 = miaLista.iterator();
		
		while (iteratore1.hasNext()) {
			String string = iteratore1.next();
			System.out.println("Il capoluogo di " + string + " è " + regioni.get(string));
		}

	}

}
