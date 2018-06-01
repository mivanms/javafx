package com.jfxtext.model.dto;

public class VehiculoDto {
	Integer id;
	String tipo;
	

	public VehiculoDto() {
		super();
	}

	public VehiculoDto(Integer id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return  tipo ;
	}
}
