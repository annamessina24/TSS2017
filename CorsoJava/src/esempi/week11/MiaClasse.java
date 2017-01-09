package esempi.week11;

public class MiaClasse extends Object {
	
	public int mioNumero;
		
		//convenzione di naming: si chiama come la classe, perciò inizia con la lettera maiuscola
		//inoltre, non ha tipo di ritorno: la sua funzione è costruire l'oggetto
		public MiaClasse(){
			
			mioNumero = 1;
			
		}

	public void mioMetodo(){
		
		System.out.println("OK");
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "esemplare di MiaClasse" + getClass().getName();
	}

	public void stampaInfo(){
		System.out.println("Stampa info ad hoc sull'oggetto");
	}
	
	public static void main(String[] args){
		MiaClasse mc = new MiaClasse();
		System.out.println(mc);
		
		MiaClasse mc2 = mc;
		System.out.println(mc2);
		
		mc = null;
		mc2= null;
		
		System.out.println(mc);
		System.out.println(mc2);
	}

}
