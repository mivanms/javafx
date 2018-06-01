package com.jfxtext.model.persistence.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.jfxtext.model.persistence.entities.TipoVehiculo;

public class VehiculoDao extends FactoryDAO{


//	public boolean insertVehiculo(Vehiculo v)
//	{
//		boolean salida = false;
//		try {
//			Connection c = super.conectar();
//			PreparedStatement stmt = c.prepareStatement("INSERT INTO Animales (codigo,especie,tipoAlimentacion,idGranjeroCompra,fechaAlta) VALUES (?,?,?,?,?)");
//			stmt.setString(1, an.getCodigo());
//			stmt.setString(2, an.getEspecie().name());
//			stmt.setString(3, an.getTipoAlimentacion());
//			stmt.setInt(4, an.getIdGranjeroCompra());
//			stmt.setDate(5, new Date(Calendar.getInstance().getTimeInMillis()));
//			
//			int fAfectadas = stmt.executeUpdate();
//			salida = (fAfectadas > 0) ? true : false;
//		} catch (SQLException e) {
//			System.out.println("[insertAnimal] Error al insertar el Animal.");
//			e.printStackTrace();
//		} finally {
//			super.desconectar();
//		}
//
//		return salida;
//
//	}

}
