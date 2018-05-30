package com.jfxtext.model.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import com.jfxtext.model.persistence.entities.TipoVehiculo;

enum Tipo
{
    COCHE, TRACTOR, APAREJO
}

public final class MockDao {

	public static List<String> getTiposVehiculo() {
		List<String> ltv = new ArrayList<String>();
		ltv.add("COCHE");
		ltv.add("TRACTOR");
		ltv.add("APAREJO");
		return ltv;
	}
	
}
