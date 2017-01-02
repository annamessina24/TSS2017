package progetti.contocorrente.v1;

public class ContoCorrente {
	
	private double saldo, tasso;
	
	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double ammontare) {
		this.saldo += ammontare;
	}
	
	public double getTasso() {
		return tasso;
	}

	public void setTasso(double tasso) {
		this.saldo = saldo + (tasso*saldo);
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
		this.setSaldo(-ammontare);
	}
	
	public void calcolaInteresse(double tasso){
		
	}

}
