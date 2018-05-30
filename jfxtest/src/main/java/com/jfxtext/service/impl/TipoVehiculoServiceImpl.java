package com.jfxtext.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfxtext.model.dto.TipoVehiculoDTO;
import com.jfxtext.model.parser.Parser;
import com.jfxtext.model.persistence.dao.TipoVehiculoDao;
import com.jfxtext.service.interfaces.TipoVehiculoService;

@Service
@Transactional(readOnly = true)
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

	@Autowired(required = false)
	private TipoVehiculoDao tipoVehiculoDao;
	
	public List<TipoVehiculoDTO> getTiposVehiculos() {
		return Parser.getTiposVehiculo(tipoVehiculoDao.listaTipos());
	}

}
