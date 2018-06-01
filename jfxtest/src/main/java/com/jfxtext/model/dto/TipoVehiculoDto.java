package com.jfxtext.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@EqualsAndHashCode @Getter  @Setter  @RequiredArgsConstructor @NoArgsConstructor
public class TipoVehiculoDto{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID") 
	private @NonNull Integer id;
	@Column(name = "TIPO")
	private @NonNull String tipo;
	
	
	@Override
	public String toString() {
		return tipo ;
	}
}
