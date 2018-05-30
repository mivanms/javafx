package com.inditex.jfxtext.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inditex.jfxtext.model.dto.TipoVehiculoDTO;
import com.inditex.jfxtext.model.parser.Parser;
import com.inditex.jfxtext.model.persistence.dao.TipoVehiculoDao;
import com.inditex.jfxtext.service.interfaces.TipoVehiculoService;

@Service
@Transactional(readOnly = true)
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

	@Autowired(required = false)
	private TipoVehiculoDao tipoVehiculoDao;
	
	public List<TipoVehiculoDTO> getTiposVehiculos() {
		return Parser.getTiposVehiculo(tipoVehiculoDao.listaTipos());
	}

}
