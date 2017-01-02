package esempi.week5.geometria;

public class Punto {
	
	//realizzo incapsulamento
	private int x;
	private int y;
	private static int conteggio = 0;
	
	//metodo costruttore, non è più disponibile il costruttore di default
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
		this.conteggio++;
	}
	
	public static int getConteggio(){
		return conteggio;
	}

	public int getX() {
		//potrei fare altre operazioni prima di ritornare il valore
		return x;
	}

	public void setX(int x) {
		//invece, quando uso set DOVREI fare altre operazioni: Ë a questo che serve set
		//comunque, essendo void il tipo di ritorno, non sono obbligato a farlo
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
