package esempi.week4;

import myutil.MioScanner;

public class EsempiSwitch {

	public static void main(String[] args) {
		
		MioScanner msc = new MioScanner();
		String s = msc.leggiStringaNonVuota("Che mese Ë? (abbr., 3 lettere) ");
		s = s.toLowerCase();
		
		switch(s){
		case "gen": case "dic":
			System.out.println("Fa freddo!");
			break;
			
		case "ago":
			System.out.println("Fa caldo!");
			break;
			
		case "mar":
			System.out.println("Piove!");
			break;
			
		default:
			System.out.println("Non ho niente da dire su questo mese...");
			break;
			
		}

	}

}
