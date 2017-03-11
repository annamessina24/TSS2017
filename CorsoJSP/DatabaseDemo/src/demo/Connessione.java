package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connessione {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/js2017";
		String userName = "root";
		String password = "";
		
		Connection miaConn = null;
		Statement mioStat = null;
		
		try {
			
			//1) ricevi la connessione al database 
			miaConn = DriverManager.getConnection(dbUrl, userName, password);
			
			//2) crea uno statement
			mioStat = miaConn.createStatement();
			
			//3) esegui la query sql
			ResultSet rs = mioStat.executeQuery("select * from js2017.studenti");
			
			//4) processa il resultSet, il metodo next sposta il cursore avanti di una posizione e ritorna 
			while (rs.next()) {
				
				System.out.print(rs.getString("cognome") + "\t");
				System.out.println(rs.getString("nome"));
				
			}
			
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
