package esempi.week1;

public class Confronti {

	public static void main(String[] args) {

		boolean b1, b2;
		int i1=3, i2=6;
		char c1='a', c2='b';
		
		b1 = i1 >= i2; //false
		
		System.out.println("b1 Ë " + b1);
		
		b2 = c1 < c2; //true
		
		System.out.println("b2 Ë " + b2);
		
		System.out.println(b1 != b2);
	}

}
