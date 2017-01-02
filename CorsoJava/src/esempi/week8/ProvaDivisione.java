package esempi.week8;

public class ProvaDivisione {

	public static void main(String[] args) {
		
		int r = 0;
		
		try {
			
			r = dividi(4,0);
			
		} catch (DivisionePerZeroException e) {
			
			e.printStackTrace();
			
		}

	}

	private static int dividi(int i, int j) throws DivisionePerZeroException {
		
		if(i==0){
			
			throw new DivisionePerZeroException("Divisione per zero non ammissibile!");
			
		}
		
		return i/j;
	}

}
