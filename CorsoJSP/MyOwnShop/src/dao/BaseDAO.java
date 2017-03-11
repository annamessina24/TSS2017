package dao;

import java.sql.Connection;

import connessione.*;

public class BaseDAO {
	
	Connection conn = null;
	
	public BaseDAO(){
		
		Connessione connessione = new Connessione();
		conn = connessione.getConnessione();
		
	}

}
