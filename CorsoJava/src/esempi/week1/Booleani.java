package esempi.week1;

public class Booleani {

	public static void main(String[] args) {

		boolean b1, b2, b3;
		
		b1 = 3 > 5; //false
		b2 = 1 < 2; //true
		
		b3 = b1 & b2;  //false
		System.out.println(b3);
		
		b3 = b1 | b2; //true
		System.out.println(b3);
	}

}
