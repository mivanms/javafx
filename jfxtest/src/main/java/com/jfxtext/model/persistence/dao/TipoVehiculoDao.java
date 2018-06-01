package com.jfxtext.model.persistence.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import com.jfxtext.model.persistence.entities.TipoVehiculo;

public class TipoVehiculoDao {

  private EntityManager entityManager = EntityManagerUtil.getEntityManager();
	  
	public List<TipoVehiculo> listaTipos()
	{
		List<TipoVehiculo> lTipos = new ArrayList<TipoVehiculo>();
		
		try {
		      entityManager.getTransaction().begin();
		      @SuppressWarnings("unchecked")
		      List<TipoVehiculo> tipoVehiculos = entityManager.createQuery("from TipoVehiculo").getResultList();
		      for (Iterator<TipoVehiculo> iterator = tipoVehiculos.iterator(); iterator.hasNext();) {
		    	  TipoVehiculo tipoVehiculo = (TipoVehiculo) iterator.next();
		    	  lTipos.add(tipoVehiculo);
		      }
		      entityManager.getTransaction().commit();
		    } catch (Exception e) {
		      entityManager.getTransaction().rollback();
		    }
		return lTipos;
	} 

}
