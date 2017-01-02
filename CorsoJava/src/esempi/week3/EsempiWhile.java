package esempi.week3;

public class EsempiWhile {

	public static void main(String[] args) {
		String[] giorni = {
				"lunedÏ",
				"martedÏ",
				"mercoledÏ",
				"giovedÏ",
				"venerdÏ",
				"sabato",
				"domenica"
		};
		
		int counter = 0;
		while (counter<giorni.length) {
			if(counter%2==0)
				System.out.println("Il giorno n. " + counter + " Ë " + giorni[counter]);
			counter++;
		}

	}

}
