package esempi.week11;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class FileIOb {

	public static void main(String[] args) {
		
		FileReader file;
		BufferedReader reader;
		
		try {
			file = new FileReader("test_files/aula.txt");
			reader = new BufferedReader(file);
			
			String allievi;
			
			while((allievi=reader.readLine())!=null){
				
				System.out.println(allievi);
				
			}
			
			reader.close();
			
		} catch (FileNotFoundException error) {
			
			System.out.println(error.getMessage());
			
		} catch (IOException error) {
			
			System.out.println(error.getMessage());
			
		}

	}

}
