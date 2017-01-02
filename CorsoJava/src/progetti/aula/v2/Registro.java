package progetti.aula.v2;

public class Registro {
	
	final int POSTAZIONI = 17;
	
	Studente[] elenco = new Studente[POSTAZIONI];
	
	public void inizializzaRegistro(){
		elenco[0] = new Studente("Roberto", "Balzano", 'M');
		elenco[1] = new Studente("Vittorio", "Bellia", 'M');
		elenco[2] = new Studente("Simone", "Bombaci", 'M');
		elenco[3] = new Studente("Monica", "Canal Monteagudo", 'F');
		elenco[4] = new Studente("Sergio", "Marzullo", 'M');
		elenco[5] = new Studente("Dario", "Mennillo", 'M');
		elenco[6] = new Studente("Anna", "Messina", 'F');
		elenco[7] = new Studente("Amedeo", "Minozzi", 'M');
		elenco[8] = new Studente("Antonio", "Morabito", 'M');
		elenco[9] = new Studente("Angelo", "Nicosia", 'M');
		elenco[10] = new Studente("Emilio", "Passannanti", 'M');
		elenco[11] = new Studente("Barbara", "Ruggirello", 'F');
		elenco[12] = new Studente("Gabriele", "Sacchet", 'M');
		elenco[13] = new Studente("Alessandra", "Sorrentino", 'F');
		elenco[14] = new Studente("NiccolÚ", "Triscio", 'M');
		elenco[15] = new Studente("Ferdinando", "Vassallo", 'M');
		elenco[16] = new Studente("Alessandra", "Zilioli", 'F');
	}
	
	/**
	//ho creato un oggetto di tipo Studente, un esemplare della classe Studente
	Studente s1 = new Studente();
			
	//assegno all'oggetto s1 il nome Anna. nb che posso farlo perchÈ il dato non Ë privato
	s1.setNome("Anna");
	s1.setCognome("Messina");
			
	
	//mando in stampa l'oggetto: quello che vedo a video Ë il reference dell'oggetto (ma non la posizione fisica nella ram, Ë l'allocazione nel registro di Java)
	System.out.println(s1);
	*/
	
	/**
	System.out.println(s1);
	//s1.presentaStudente();

	/*
	//operazioni che posso svolgere dall'esterno della classe
	System.out.println(s1.getNome());
	System.out.println(s1.getCognome());
	System.out.println(s1.getMatricola());
	System.out.println("-------------------");
	*/
			
	/**
	//creo un oggetto che punta allo stesso spazio in memoria di s1
	//nb che non Ë un clone: quello sarebbe un oggetto uguale a s1 che perÚ occupa un diverso spazio in memoria
	Studente s2 = s1;
	System.out.println(s2);
	System.out.println(s2.getNome());
	System.out.println("-------------------");
	*/
			
	/**
	Studente s3 = new Studente("Minozzi");
	s3.setNome("Amedeo");
	System.out.println(s3);
	//s3.presentaStudente();
	/*
	System.out.println(s3);
	System.out.println(s3.getNome());
	System.out.println(s3.getCognome());
	System.out.println(s3.getMatricola());
	System.out.println("---------");
	*/
		
	/**
	Studente s4 = new Studente("Antonio", "Morabito");
	System.out.println(s4);
	//s4.presentaStudente();
	/*
	System.out.println(s4);
	System.out.println(s4.getNome());
	System.out.println(s4.getCognome());
	System.out.println(s4.getMatricola());
	System.out.println("-------------------");
	*/
			
	/**
	Studente s5 = new Studente();
	System.out.println(s5);
	System.out.println(s5.nome());

	s5.nome = "Anna";
			
	if(s1 == s5) System.out.println("Sono uguali"); else System.out.println("Sono diversi");
	if(s1.nome == s5.nome) System.out.println("Sono uguali"); else System.out.println("Sono diversi");
	*/
}

