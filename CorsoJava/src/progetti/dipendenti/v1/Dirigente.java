package progetti.dipendenti.v1;

public class Dirigente extends Lavoratore {
	
	double premioRisultato = 0.25;

	public Dirigente(String nome, String cognome) {
		
		super(nome, cognome);
		System.out.println("Ho costruito un oggetto di tipo Dirigente, sottotipo di Lavoratore.");
		
	}

	@Override
	public double calcolaStipendio(int numeroOre) {
		
		return super.calcolaStipendio(numeroOre) + (super.calcolaStipendio(numeroOre))*premioRisultato;
	}
	
	

}
