package com.jfxtext.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jfxtext.model.dto.TipoVehiculoDto;
import com.jfxtext.model.mapper.TipoVehiculoMapper;
import com.jfxtext.model.persistence.dao.TipoVehiculoDao;
import com.jfxtext.service.interfaces.TipoVehiculoService;

@Service
@Transactional(readOnly = true)
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

	@Autowired(required = false)
	private TipoVehiculoDao tipoVehiculoDao;
	
	@Autowired(required = false)
	TipoVehiculoMapper tipoVehiculoMapper;
	
	public List<TipoVehiculoDto> getTiposVehiculos() {
		return tipoVehiculoMapper.toDto(tipoVehiculoDao.listaTipos());
	}

}
