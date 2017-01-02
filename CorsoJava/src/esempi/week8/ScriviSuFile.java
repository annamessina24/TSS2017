package esempi.week8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class ScriviSuFile {

	public static void main(String[] args) {
		
		try {
			
			PrintStream writer = new PrintStream(new File("InteriCasuali.txt"));
			Random r = new Random();
			final int LIMIT = 100;
			
			for(int i=0; i<LIMIT; i++){
				writer.println(r.nextInt());
			}
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}  catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
