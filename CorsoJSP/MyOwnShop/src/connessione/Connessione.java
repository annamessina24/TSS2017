package connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String DB_URL = "jdbc:mysql://localhost:3306/myshop";
	private final String USER = "root";
	private final String PASS = "";
	
	public Connection getConnessione(){
		
		Connection connessione = null;
		
		try{
			
			connessione = DriverManager.getConnection(DB_URL, USER, PASS);
			
		} catch(SQLException e){
			
			System.out.println("Connessione al DB fallita!");
			e.printStackTrace();
			
		}
		
		return connessione;
		
	}

}
