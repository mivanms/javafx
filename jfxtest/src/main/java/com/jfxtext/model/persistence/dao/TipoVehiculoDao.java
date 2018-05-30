package com.jfxtext.model.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jfxtext.model.persistence.entities.TipoVehiculo;

public class TipoVehiculoDao extends FactoryDAO{

	public List<TipoVehiculo> listaTipos()
	{
		
		List<TipoVehiculo> la = new ArrayList<TipoVehiculo>();
		
		//Para que traiga datos al llamar a la base de datos
		TipoVehiculo an = null;
				
		try {	
			Connection c = super.conectar(); //Conectar dentro para controlarlo

			PreparedStatement stmt = c.prepareStatement("SELECT * FROM TipoVehiculo");

			ResultSet rs = stmt.executeQuery();		

			//Mientras haya siguiente, ir metiendo en la lista
			while(rs.next())
			{
				an= new TipoVehiculo(Integer.valueOf(rs.getString("id")),rs.getString("descripcion"));
				la.add(an);
			}
		
		} catch (SQLException e) {
			System.out.println( "[listAnimales] Error al mostrar los Animales: " + e.getMessage());  
			e.printStackTrace();

		} finally {
			super.desconectar();
		}
				
		return la;
	} 
}
