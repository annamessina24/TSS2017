package esempi.week11;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> ricetteMondo = new ArrayList<>();
		
		ricetteMondo.add("Pao de quejo (Eliane)");
		ricetteMondo.add("Pita sa povrcem (Dragana)");
		
		System.out.println(ricetteMondo);
		System.out.println();
		
		ricetteMondo.add("Beignets (Fatou, Sokhna)");
		ricetteMondo.add("Mssemmen (Marocco)");
		ricetteMondo.add("Pudin de maracuja (Mariana, Eliane)");
		
		for (String string : ricetteMondo) {
			System.out.println(string);
		}
		System.out.println();
		
		ricetteMondo.remove(3);
		
		System.out.println(ricetteMondo.get(3));

		ricetteMondo.add("Mssemmen (Marocco)");
		
		System.out.println(ricetteMondo.indexOf("Mssemmen (Marocco)"));

	}

}
