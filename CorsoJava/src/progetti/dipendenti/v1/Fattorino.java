package progetti.dipendenti.v1;

public class Fattorino extends Lavoratore {
	
	double premioRisultato = 0.05;
	
	public Fattorino(String n, String c){
		
		super(n, c);
		System.out.println("Ho costruito un oggetto di tipo Fattorino, sottotipo di Lavoratore.");
		
	}

	@Override
	public double calcolaStipendio(int numeroOre) {
		
		double stipendioFattorino = super.calcolaStipendio(numeroOre) + (super.calcolaStipendio(numeroOre))*premioRisultato;
		
		return stipendioFattorino;
		
	}
	
	

}
