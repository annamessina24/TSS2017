package esempi.week11;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("test_files/aula.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String allievi;
		
		while((allievi=reader.readLine())!=null){
			
			System.out.println(allievi);
			
		}
		
		reader.close();

	}

}
