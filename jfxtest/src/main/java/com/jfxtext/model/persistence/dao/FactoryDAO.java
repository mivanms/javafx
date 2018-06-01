package com.jfxtext.model.persistence.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcConnectionPool;

public class FactoryDAO {
	private Connection connection;
	JdbcConnectionPool cp ;
	private static final String DRIVER = "org.h2.Driver";
	private static final String BD = "jdbc:h2:~/test";
	private static final String USUARIO = "admin";  
	private static final String PASSWORD = "admin";  
	
	public FactoryDAO() { }
	
	protected Connection conectar() {  
		try {
			Class.forName(DRIVER);
			cp = JdbcConnectionPool.create(BD, USUARIO, PASSWORD);
			connection = cp.getConnection();
		
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
	cp.dispose();
	} catch (SQLException e) {e.printStackTrace();}
	}
	
	
	public Connection getConnection() { return connection; }

}