package esempi.week4;

public class ContoCorrenteTester {

	public static void main(String[] args){
		ContoCorrente mioConto = new ContoCorrente();
		//ContoCorrente contoMamma = new ContoCorrente();
		
		mioConto.Versamento(1000);
		mioConto.Prelievo(500);
		mioConto.Prelievo(400);
		System.out.println(mioConto.getSaldo());
		
		mioConto.setTasso(0.1);
		System.out.println(mioConto.getSaldo());
	}

}
