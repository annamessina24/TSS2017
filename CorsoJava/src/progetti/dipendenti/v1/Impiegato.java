package progetti.dipendenti.v1;

public class Impiegato extends Lavoratore {
	
	double premioRisultato = 0.10;
	
	public Impiegato(String n, String c){
		
		super(n, c);
		System.out.println("Ho costruito un oggetto di tipo Impiegato, sottotipo di Lavoratore.");
		
	}

	@Override
	public double calcolaStipendio(int numeroOre) {
		
		double stipendioImpiegato = super.calcolaStipendio(numeroOre) + (super.calcolaStipendio(numeroOre))*premioRisultato;
		
		stipendioImpiegato = (numeroOre>90) ? (stipendioImpiegato += premioRisultato) : (stipendioImpiegato);
		
		return stipendioImpiegato;
		
	}
	
	

}
