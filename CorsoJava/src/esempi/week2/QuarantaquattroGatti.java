package esempi.week2;

public class QuarantaquattroGatti {

	public static void main(String[] args) {

		String gatti = "QuarantaquattroGattInFilaPerSeiColRestoDiDue";
		
		System.out.println(gatti.length());
		
		for(int i=1, a=0; i<=gatti.length(); i++, a++) {
			
			System.out.print(gatti.charAt(a));
			if(i%6==0) System.out.println();
			
		}
	}

}
