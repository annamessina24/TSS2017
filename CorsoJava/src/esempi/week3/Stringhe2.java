package esempi.week3;

public class Stringhe2 {

	public static void main(String[] args) {
		/*
		System.out.println(Math.PI);
		System.out.println(Math.E);
		*/
		
		/*
		for(int i=0; i<100; i++) {
			int lancio = (int)(Math.random()*6) + 1;
			System.out.println("Lancio n." + (i+1) + ": " + lancio);
		}
		*/
		
		String s = "qwertyuiopasdfghjklzxcvbnm";
				
        char[] caratteri = s.toCharArray();
        
        String s1 = "Ciao mondo";
        String s2 = "Ciao ";
        String s3 = s2 + "mondo";
        
        /*
        if(s1==s3) {
        	System.out.println("Le stringhe sono uguali.");
        }
        else {
        	System.out.println("Le stringhe sono diverse.");
        }
        */
        
        //in questo caso ha senso che le stringhe risultino diverse, perchÈ con == si confronta lo spazio di memoria allocato per ciascuna stringa, ma non il contenuto
        //di fatto, s1, s2, s3 sono tre diversi oggetti in memoria
        //per verificare che il contenuto sia lo stesso c'Ë una funzione apposita (equals)
        
        if(s1.equals(s3)) {
        	System.out.println("Le stringhe sono uguali.");
        }
        else {
        	System.out.println("Le stringhe sono diverse.");
        }
        
        System.out.println(s1.toUpperCase());
        System.out.println(s3.length());
        
        System.out.println(s.indexOf("m"));
        System.out.println(s.length());
        
        if(s1.indexOf("z")>-1) //-1 perchÈ nella stringa la posizione zero esiste
        	System.out.println("La sottostringa Ë presente in posizione " + s1.indexOf("z") + ".");
        else
        	System.out.println("La sottostringa non Ë presente.");
        
        System.out.println(s1.indexOf("mondo")); //cerca dove si trovi la parola o il carattere all'interno della stringa considerata
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.indexOf("o", 4)); //dopo il quarto carattere
        System.out.println(s1.lastIndexOf("o"));
        
        System.out.println(s1.replace('o', 'i')); 
        
        String s4 = "   Ciao   ";
        System.out.println(s4);
        System.out.println(s4.trim()); //toglie gli spazi esterni
        
        int temp =(s.indexOf("o"));
        System.out.println(s.substring(temp)); //stampa a video solo i caratteri da un certo punto che indico io fino alla fine della stringa
        System.out.println(s.substring(temp, temp+5)); //stampa a video solo i caratteri compresi fra due punti che indico io

        /*
        for(int i=0; i<caratteri.length; i++) {
        	int posCarattere = (int)(Math.random()*caratteri.length);
        	System.out.println(caratteri[posCarattere]);  
        }
        */
        
        /*
        //ciclo di 100 righe
        for(int i=0; i<100; i++) {
        	//ciclo interno per la parola
        	for(int j=0; j<6; j++) {
        		int posCarattere = (int)(Math.random()*s.length());
        		System.out.print(caratteri[posCarattere]);  
        	}
        	System.out.println();
        }
        */
        

	}

}
