package esempi.week3;

public class AltriEsempiFor {

	public static void main(String[] args) {
		String[] frutti = {
				"mele",
				"pere",
				"banane"
		};
		
		int[] voti = {
				18,
				27,
				29,
				24
		};
		
		//ciclo per scorrere array
		for(int i =0; i<frutti.length; i++) {
			System.out.println("Vuoi " + frutti[i] + "?");
		}
		
		//ciclo per scorrere array in verso contrario all'inserimento dei dati
		for(int i=voti.length-1; i>=0; i--) {
			System.out.println(voti[i]);
		}
		
		//enhanced for (foreach degli altri linguaggi)
		for(String stringa : frutti) {
			System.out.println(stringa.length());
			System.out.println(stringa.toUpperCase());
		}
		
		int indice = 0;
		for(int i : voti) {
			int test = voti[indice] = (i+1);
			indice++;
			System.out.println(test);
		}

	}

}
