package progetti.negozio.v1;

import java.util.ArrayList;

public class Negozio {
	
	private String Nome;
	private String NomeNegozio;
	private String Indirizzo;
	private String Telefono;
	private String SitoWeb;
	
	private double Incasso;
	
	private ArrayList<Prodotti> prodotti;
	
	public Negozio(String _Nome, String _NomeNegozio){
		
		setNome(_Nome);
		setNomeNegozio(_NomeNegozio);
		
	}
	
	public Negozio(String _Nome, String _NomeNegozio, String _Indirizzo, String _Telefono, String _SitoWeb){
		
		setNome(_Nome);
		setNomeNegozio(_NomeNegozio);
		setIndirizzo(_Indirizzo);
		setTelefono(_Telefono);
		setSitoWeb(_SitoWeb);
		
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}

	/**
	 * @return the nomeNegozio
	 */
	public String getNomeNegozio() {
		return NomeNegozio;
	}

	/**
	 * @param nomeNegozio the nomeNegozio to set
	 */
	public void setNomeNegozio(String nomeNegozio) {
		NomeNegozio = nomeNegozio;
	}

	/**
	 * @return the indirizzo
	 */
	public String getIndirizzo() {
		return Indirizzo;
	}

	/**
	 * @param indirizzo the indirizzo to set
	 */
	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return Telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	/**
	 * @return the sitoWeb
	 */
	public String getSitoWeb() {
		return SitoWeb;
	}

	/**
	 * @param sitoWeb the sitoWeb to set
	 */
	public void setSitoWeb(String sitoWeb) {
		SitoWeb = sitoWeb;
	}

	/**
	 * @return the incasso
	 */
	public double getIncasso() {
		return Incasso;
	}

	/**
	 * @param incasso the incasso to set
	 */
	public void setIncasso(double incasso) {
		Incasso = incasso;
	}
	
	/**
	 * @return the prodotti
	 */
	public ArrayList<Prodotti> getProdotti() {
		return prodotti;
	}

	/**
	 * @param prodotti the prodotti to set
	 */
	public void setProdotti(ArrayList<Prodotti> prodotti) {
		this.prodotti = prodotti;
	}

	public void creaProdotti(){
		
		prodotti = new ArrayList<>();
		prodotti.add(new Prodotti("Panna", 0.50));
		prodotti.add(new Prodotti("Cioccolato", 1.00));
		prodotti.add(new Prodotti("Pistacchio", 0.80));
		prodotti.add(new Prodotti("Crema della nonna", 0.90));
		prodotti.add(new Prodotti("Gianduja", 1.10));
		
	}

	public void elencaProdotti() {
		
		int i = 1;
		for (Prodotti prodotto : prodotti) {

			System.out.println(i+")"+prodotto.getNome() + ": " +  "prezzo " + prodotto.getPrezzo());
			i++;
		}
		
	}

	public Prodotti vendiProdotto(int pos) {
		
		Prodotti p = prodotti.get(pos-1);
		Incasso = Incasso + p.getPrezzo();
		
		// rimuovo il prodotto dalla lista
		prodotti.remove(pos-1);
		return p;
		
	}

	public void nuovoProdotto(Prodotti prodotto) {
		
		prodotti.add(prodotto);
		
	}

}
