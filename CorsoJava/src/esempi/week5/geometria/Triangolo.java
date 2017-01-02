package esempi.week5.geometria;

public class Triangolo {
	
	private Segmento a, b, c;
	
	private Punto v1,v2, v3;
	
	private final double EPSILON = 0.0000000001;
	
	public Triangolo(Punto _v1, Punto _v2, Punto _v3){
		
		this.v1 = _v1;
		this.v2 = _v2;
		this.v3 = _v3;
		
		this.a = new Segmento(_v1, _v2);
		this.b = new Segmento(_v2, _v3);
		this.c = new Segmento(_v3, _v1);
		
	}

	public Segmento getA() {
		return a;
	}

	public void setA(Segmento a) {
		this.a = a;
	}

	public Segmento getB() {
		return b;
	}

	public void setB(Segmento b) {
		this.b = b;
	}

	public Segmento getC() {
		return c;
	}

	public void setC(Segmento c) {
		this.c = c;
	}
	
	public double perimetroTriangolo(){
		
		//questo perchÈ a, b e c, essendo oggetti, non possono essere sommati direttamente!
		return a.lunghezzaSegmento() + b.lunghezzaSegmento() + c.lunghezzaSegmento();
	}

	public double areaTriangolo(){
		double areaTriangolo = 0;
		
		//uso Formula di Erone
		
		//semiperimetro
		double s = this.perimetroTriangolo()/2;
		
		//formula vera e propria
		areaTriangolo = Math.sqrt(s*
				(s-a.lunghezzaSegmento())*
				(s-b.lunghezzaSegmento())*
				(s-c.lunghezzaSegmento()));
		
		return areaTriangolo;
	}
	
	public boolean isRettangolo(){
		

		if ( Math.abs(   
				Math.pow(a.lunghezzaSegmento(), 2) +   
				Math.pow(b.lunghezzaSegmento(), 2) - 
				Math.pow(c.lunghezzaSegmento(), 2)    
				
				)  < EPSILON     ) return true;

		
		if ( Math.abs(   
				Math.pow(a.lunghezzaSegmento(), 2) +   
				Math.pow(c.lunghezzaSegmento(), 2) - 
				Math.pow(b.lunghezzaSegmento(), 2)    
				
				)  < EPSILON     ) return true;		
		
		
		if ( Math.abs(   
				Math.pow(c.lunghezzaSegmento(), 2) +   
				Math.pow(b.lunghezzaSegmento(), 2) - 
				Math.pow(a.lunghezzaSegmento(), 2)    
				
				)  < EPSILON     ) return true;		
		
		return false;
	}
	
}
