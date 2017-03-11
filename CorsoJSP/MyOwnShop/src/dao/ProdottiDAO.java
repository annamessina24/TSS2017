package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdottiDAO extends BaseDAO {
	
	Connection miaConn = null;
	
	public ProdottiDAO(){
	
		super();
		this.miaConn = conn;
		
	}
	
	public Connection getMiaConn() {
		return miaConn;
	}

	public void mostraProdotti(Connection miaConn, int idCat) throws SQLException {
		
		PreparedStatement mioStat = null;
		
		try {
					
			String sql = "SELECT * FROM PRODOTTI WHERE id_cat=?";
					
			mioStat = miaConn.prepareStatement(sql);
					
			mioStat.setInt(1, idCat);
					
			ResultSet rs = mioStat.executeQuery();
					
			System.out.print("[");
					
			while (rs.next()) {
						
				System.out.println("{");
				System.out.println("\"id\": " + rs.getInt(1) + ",");
				System.out.println("\"colore\": \"" + rs.getString(2) + "\",");
				System.out.println("\"taglia\": \"" + rs.getString(3) + "\",");
				System.out.println("\"misura\": " + rs.getInt(4) + ",");
				System.out.println("\"prezzo\": " + rs.getDouble(5) + ",");
				System.out.println("\"id_cat\": " + rs.getInt(6));
				System.out.println("}");
						
			}
					
			System.out.print("]");
					
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
	
	/*public static void main(String[] args) {
		
		ProdottiDAO pdao = new ProdottiDAO();
		PreparedStatement ps = null;
		
		try {
			
			pdao.mostraProdotti(miaConn, ps, 3);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}*/

}
