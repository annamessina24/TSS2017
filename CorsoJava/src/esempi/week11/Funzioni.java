package esempi.week11;

public class Funzioni {
	
	public static void main(String[] args) {
		
		/*
		 * Se non avessi impostato saluta() come static, avrei dovuto fare una cosa di questo genere:
		 * Funzioni miaFunc = new Funzioni();
		 * miaFunc.saluta();
		 * altrimenti avrei ottenuto un errore in compilazione
		 * */
		
		//da statico, il metodo saluta() è un metodo di classe
		saluta();
		
		Funzioni miaFunc = new Funzioni();
		miaFunc.salutaPlus("tutto bene?");
		
	}
	
	public static void saluta(){
		
		System.out.println("Ciao!");
		
	}
	
	public String salutaPlus(String messaggio){
		
		System.out.println("Ciao, " + messaggio);
		return "tutto bene";
	}

}
