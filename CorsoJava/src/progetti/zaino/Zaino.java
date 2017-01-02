package progetti.zaino;

import java.util.ArrayList;

public class Zaino {
	
	private String marca, proprietario;
	private int massimoNumeroDiCose;
	
	private ArrayList<Cosa> cose;

	public Zaino(String marca, String proprietario, int massimoNumeroDiCose) {
		
		this.marca = marca;
		this.proprietario = proprietario;
		this.massimoNumeroDiCose = massimoNumeroDiCose;
		creaCose();
		
	}

	private void creaCose() {
		
		cose = new ArrayList<>();
		
		cose.add(new Cosa("Portapenne", "Uomo Ragno"));
		cose.add(new Cosa("Portachivi", "Wonder Woman"));
		
	}

	/**
	 * @return the massimoNumeroDiCose
	 */
	public int getMassimoNumeroDiCose() {
		return massimoNumeroDiCose;
	}

	/**
	 * @param massimoNumeroDiCose the massimoNumeroDiCose to set
	 */
	public void setMassimoNumeroDiCose(int massimoNumeroDiCose) {
		this.massimoNumeroDiCose = massimoNumeroDiCose;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @return the proprietario
	 */
	public String getProprietario() {
		return proprietario;
	}

	/**
	 * @return the cose
	 */
	public ArrayList<Cosa> getCose() {
		return cose;
	}
	
	public void elencaCose(){
		
		int i=0;
		
		for (Cosa cosa : cose) {
			System.out.println(cosa);
			System.out.println(i + ") " + cosa.getNome() + " " + cosa.getDescrizione());
			i++;
		}
		
	}
	
	public boolean inserisciCosa(Cosa c){
		
		if(massimoNumeroDiCose>cose.size()){
			
			cose.add(c);
			return true;
			
		}
		
		else return false;
		
	}
	
	public Cosa prendiCosa(int posizione){
		
		Cosa c = cose.get(posizione);
		cose.remove(posizione);
		return c;
		
	}

}
