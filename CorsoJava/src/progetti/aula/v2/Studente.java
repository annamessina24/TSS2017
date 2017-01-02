package progetti.aula.v2;

public class Studente {

	private int matricola = 0;
	private static int matricolatore = 1;
	private char genere;
	private String nome, cognome;
	
	//i getter e i setter li posso usare quante volte voglio
	public int getMatricola() {
		return matricola;
	}

	public void setMatricola() {
			this.matricola = matricolatore++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public char getGenere() {
		return genere;
	}

	public void setGenere(char genere) {
		this.genere = genere;
	}

	//overload dei metodi
	public Studente(){
		this.setMatricola();
	}
	
	//posso usare questi metodi solo quando costruisco l'oggetto, e poi basta
	public Studente(String cognome){
		this.cognome = cognome;
		this.setMatricola();
	}
	
	public Studente(String nome, String cognome, char genere){
		
		//quando uso this mi riferisco all'istanza corrente dell'oggetto di tipo Studente
		this.nome = nome;
		this.cognome = cognome;
		this.genere = genere;
		this.setMatricola();
		
	}
	
	public void presentaStudente(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Cognome: " + this.cognome);
		System.out.println("Matricola: " + this.matricola);
		System.out.println("------------------------------");
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + 
				"Cognome: " + this.cognome + "\n" + 
				"Genere: " + this.genere + "\n" +
				"Matricola: " + this.matricola + "\n" + 
				"------------------------------";
				
	}
	
	

}
