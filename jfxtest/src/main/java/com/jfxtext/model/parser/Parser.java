package com.jfxtext.model.parser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.jfxtext.model.dto.TipoVehiculoDTO;
import com.jfxtext.model.persistence.entities.TipoVehiculo;

public final class Parser {

	public static List<TipoVehiculoDTO> getTiposVehiculo(List<TipoVehiculo> etv) {
		List<TipoVehiculoDTO> lTvDTO = new ArrayList<TipoVehiculoDTO>();
		TipoVehiculoDTO tvDTO;
		
		for (TipoVehiculo tipoVehiculo : etv) {
			tvDTO= new TipoVehiculoDTO();
			BeanUtils.copyProperties(tipoVehiculo, tvDTO);
			lTvDTO.add(tvDTO);
		}

		return lTvDTO;
	}
}
