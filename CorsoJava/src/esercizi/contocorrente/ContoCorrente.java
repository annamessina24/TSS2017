package esercizi.contocorrente;

public class ContoCorrente {
	
	private double saldo, tasso;
	private int numero;
	private static int contatore;
	/*
	public ContoCorrente(String nome, double saldo){
		
		this.nome = nome;
		this.saldo = saldo;
		this.contatore++;
		
	}
	*/
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTasso() {
		return tasso;
	}

	public void setTasso(double tasso) {
		this.saldo = saldo + (tasso*saldo);
	}

	public int getNumero() {
		return contatore;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public ContoCorrente(){
		this.saldo = 0.0;
		this.tasso = 0.0;
		
	}
	
	public ContoCorrente(double saldo){
		this.saldo += saldo;
		this.tasso = 0.0;
	}
	
	public void Versamento(double ammontare){
		this.setSaldo(ammontare);
	}
	
	public void Prelievo(double ammontare){
		
		if(ammontare>saldo)
			System.out.println("Errore! Impossibile prelevare la cifra richiesta.");
		else
			this.setSaldo(-ammontare);
		
	}
	
	public void maturaInteressi(){
		
	}

}
