package esempi.week4;

import myutil.MioScanner;

public class SoloVocali {

	public static void main(String[] args) {
		
		MioScanner sc = new MioScanner();
		
		String s = sc.leggiStringaNonVuota("Scrivi una frase: ");
		
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(c); break;
			}
		}

	}

}
