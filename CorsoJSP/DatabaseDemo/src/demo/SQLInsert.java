package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLInsert {
	
	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/js2017";
		String userName = "root";
		String password = "";
		
		Connection miaConn = null;
		Statement mioStat = null;
		ResultSet rs = null;
		
		try {
			
			//1) ricevi la connessione al database 
			miaConn = DriverManager.getConnection(dbUrl, userName, password);
			
			//2) crea uno statement
			mioStat = miaConn.createStatement();
			
			//3) inserisco un nuovo record
			System.out.println("Inserisco nuovo record");

			//4) eseguo la query sql
			String sql = "INSERT INTO studenti(studente_id, nome, cognome, data_nascita, eta, sesso) VALUES (17, 'cristiana', 'nicolino', '1988-03-24', 28, 'F');";
			
			int righeInteressate = mioStat.executeUpdate(sql);
			
			//5) aggiorna l'elenco degli studenti
			rs = mioStat.executeQuery("select * from js2017.studenti");
			
			while (rs.next()) {
				
				System.out.print(rs.getString("cognome") + "\t");
				System.out.println(rs.getString("nome"));
				
			}
			
			System.out.println("Query eseguita con successo. " + righeInteressate + " righe interessate.");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				miaConn.close();
				mioStat.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}
