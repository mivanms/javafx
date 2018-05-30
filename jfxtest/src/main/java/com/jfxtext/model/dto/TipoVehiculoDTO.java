package com.jfxtext.model.dto;

public class TipoVehiculoDTO {
	Integer id;
	String descripcion;
	

	public TipoVehiculoDTO() {
		super();
	}

	public TipoVehiculoDTO(Integer id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return  descripcion ;
	}
}
