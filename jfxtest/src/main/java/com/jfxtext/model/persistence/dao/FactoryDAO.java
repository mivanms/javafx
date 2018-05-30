package com.jfxtext.model.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryDAO {
	private Connection connection;
	private static final String DRIVER = "org.h2.Driver";
	private static final String BD = "jdbc:h2:~/test";
	private static final String USUARIO = "admin";  
	private static final String PASSWORD = "admin";  
	
	public FactoryDAO() { }
	
	protected Connection conectar() {  
		try {
	
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(BD, USUARIO, PASSWORD);
		
	} catch (ClassNotFoundException e) { 
		e.printStackTrace(); 
	} catch (SQLException e) { 
		e.printStackTrace();
		}
		
		return connection;
	}
	
	
	protected void desconectar() {
	try {
	connection.close();
	} catch (SQLException e) {e.printStackTrace();}
	}
	
	
	public Connection getConnection() { return connection; }

}
