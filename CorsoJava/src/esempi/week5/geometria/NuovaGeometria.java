package esempi.week5.geometria;

public class NuovaGeometria {

	public static void main(String[] args) {
		
		//---------PUNTO---------
		
		Punto a = new Punto(2, 2);
		Punto b = new Punto(4, 3);
		
		Punto c = new Punto(4, 2);
		Punto d = new Punto(2, 3);
		
		System.out.println(a);
		System.out.println(b);
		
		//---------SEGMENTO---------
		
		Segmento segmento1 = new Segmento(a, b);
		System.out.println(segmento1.lunghezzaSegmento());
		
		Segmento segmento2 = new Segmento(a, c);
		System.out.println(segmento2.lunghezzaSegmento());

		//rimane uguale anche se scambio l'ordine?
		Segmento segmento2bis = new Segmento(c, a);
		System.out.println(segmento2bis.lunghezzaSegmento());
		
		Segmento segmento3 = new Segmento(c, b);
		System.out.println(segmento3.lunghezzaSegmento());
		
		//---------TRIANGOLO---------
		
		Triangolo triangolo1 = new Triangolo(a, b, c);
		System.out.println(triangolo1.perimetroTriangolo());
		System.out.println(triangolo1.areaTriangolo());

	}

}
