package progetti.agenda;

import java.util.ArrayList;
import java.util.Date;

public class Agenda2 {
	
	/**dichiaro un oggetto di tipo ArrayList: quello che ottengo è un 
	 *ArrayList di oggetti di tipo Appuntamento.
	 *ArrayList è sempre un contenitore, ma ridimensionabile: 
	 *quindi ora posso fare a meno del controllo sulle dimensioni,
	 * e al tempo stesso ho molto meno codice!*/
	
	private ArrayList<Appuntamento> appuntamenti;
	
	public Agenda2(){
		//<>: operatore diamond
		this.appuntamenti = new ArrayList<>();
	}
	
	public void creaAppuntamento(String descrizione, Date data, int priorita){
		//aggiungo elementi ad un ArrayList chiamando il suo metodo add
		appuntamenti.add(new Appuntamento(descrizione, data, priorita));
	}
	
	public ArrayList<Appuntamento> leggiAgenda(){
		return this.appuntamenti;
	}
	
}
