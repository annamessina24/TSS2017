package esempi.week3;

public class Stringhe1 {

	public static void main(String[] args) {
		
		//dichiaro l'oggetto stringa e lo istanzio
		String s1 = "Questa Ë una stringa!";
		System.out.println(s1);
		System.out.println("La stringa Ë lunga " + s1.length() + ".");
		
		//dichiaro l'oggetto stringa e lo istanzio con l'operatore new
		//questa Ë un particolarit‡ dell'oggetto String
		String s2 = new String("Anche questa Ë una stringa con pari dignit‡!");
		System.out.println(s2);
		System.out.println("La stringa Ë lunga " + s2.length() + ".");
		
	    String s3 = "Aula: ";
        String s4 = "1F";

        String s5 = s3 + s4;
        System.out.println(s5);
        
        //la stringa ammette come parametri anche gli array di char
        
        char[] caratteri = { 'C','i','a','o' };
        //metodo costruttore delle stringhe che accetta come argomento un array di caratteri: String(char[] value)
        String s6 = new String(caratteri); 
        //notare che non potrei scrivere una cosa del tipo String s7 = caratteri;, perchÈ non sono dello stesso tipo
        System.out.println(s6);
        
        //esercizio 1: identifica il carattere spazio bianco nell'array precedente e con un'istruzione if non stampare la riga a video
        
        char[] caratteri2 = s2.toCharArray();
        for(int i=0; i<caratteri2.length; i++) {
        	if(caratteri2[i]!=' ')
        	System.out.println(caratteri2[i]);  
        }
        
        for(int j=caratteri2.length-1; j>=0; j--) {
        	System.out.print(caratteri2[j]);
        }
        
    	System.out.println();
    	
        //esercizio 2: stampa l'array di caratteri in ordine inverso, in orizzontale e successivamente in verticale
        
        for(int j=caratteri2.length-1; j>=0; j--) {
        	System.out.println(caratteri2[j]);
        }
        
        
	}

}
