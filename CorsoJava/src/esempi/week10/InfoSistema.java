package esempi.week10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InfoSistema {
	
	public static void main(String[] args) {
		
		File output = new File("test_files/InfoSistema.txt");
		
		FileOutputStream fos;
		
		try{
			
			fos = new FileOutputStream(output);
			
		} catch (IOException e){
			
			fos = null;
			
		}
		
		PrintStream ps = new PrintStream(fos);
		
		System.setOut(ps);
		
		long tempo = System.currentTimeMillis();
		System.out.println("Tempo in millisecondi: " + tempo);
		
		long tsec = tempo/1000;
		System.out.println("Tempo in secondi: " + tsec);
		
		long sec = tsec%60;
		long t3 = tsec/60;
		long min = t3%60;
		long t4 = t3/60;
		
		System.out.println("Tempo in ore: " + t4 + " minuti: " + min + " secondi " + sec);
		System.out.println("Tempo trascorso dal 1 gennaio 1970.");
		
		System.out.println("*****Propriet‡ del sistema*****");
		String temp = System.getProperty("java.version");
		System.out.println("Versione di Java: " + temp);
		temp = System.getProperty("java.vendor");
		System.out.println("Vendor: " + temp);
		temp = System.getProperty("java.home");
		System.out.println("Home: " + temp);
		temp = System.getProperty("java.vm.version");
		System.out.println("Versione: " + temp);
		
		System.out.println("*****Propriet‡ del sistema operativo*****");
		temp = System.getProperty("os.version");
		System.out.println("Versione: " + temp);
		temp = System.getProperty("os.name");
		System.out.println("Nome: " + temp);
		temp = System.getProperty("os.arch");
		System.out.println("Architettura: " + temp);
		temp = System.getProperty("path.separator");
		System.out.println("Separatore di path: " + temp);
		temp = System.getProperty("user.name");
		System.out.println("Username: " + temp);
		temp = System.getProperty("user.dir");
		System.out.println("User Directory: " + temp);
		
	}

}
