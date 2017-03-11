<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dao.*, java.sql.Connection, java.sql.PreparedStatement, java.sql.ResultSet, java.sql.SQLException" %>

<% 

	ProdottiDAO pdao = new ProdottiDAO();
	PreparedStatement ps = null;
	
		try {
			
			pdao.mostraProdotti(pdao.getMiaConn(), 3);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	

%>