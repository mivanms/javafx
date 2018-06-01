package com.jfxtext.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.jfxtext.model.dto.TipoVehiculoDto;
import com.jfxtext.model.persistence.entities.TipoVehiculo;


public  class TipoVehiculoMapper {
	public  TipoVehiculoDto toDto(TipoVehiculo tv)
	{
		TipoVehiculoDto dto = new TipoVehiculoDto();
		BeanUtils.copyProperties(tv, dto);
		return dto;
	}
	public  List<TipoVehiculoDto> toDto(List<TipoVehiculo> ltv)
	{
		List<TipoVehiculoDto> ldto = ltv.stream().map(tv-> { return toDto(tv); }).collect(Collectors.toList());
		return ldto;
	}
	public TipoVehiculo toEntity(TipoVehiculoDto dto)
	{
		TipoVehiculo tv = new TipoVehiculo();
		BeanUtils.copyProperties(dto, tv);
		return tv;
	}
	public  List<TipoVehiculo> toEntity(List<TipoVehiculoDto> ldto)
	{
		List<TipoVehiculo> ltv = ldto.stream().map(dto-> { return toEntity(dto); }).collect(Collectors.toList());
		return ltv;
	}
}