package progetti.agenda;

import java.util.Date;

public class Appuntamento {
	
	private String descrizione;
	private Date data;
	private int priorita;
	/*
	public Appuntamento(){
		this.descrizione = "default";
		this.data = new Date();
		this.priorita = 1;
	}
	
	public Appuntamento(String descrizione){
		this.descrizione = descrizione;
		this.data = new Date();
		this.priorita = 1;
	}
	*/
	public Appuntamento(String descrizione, Date data, int priorita) {
		this.descrizione = descrizione;
		this.data = data;
		this.priorita = priorita;
	}
	
	@Override
	public String toString(){
		return descrizione + " [" + data + "] " + priorita;
	}

}
