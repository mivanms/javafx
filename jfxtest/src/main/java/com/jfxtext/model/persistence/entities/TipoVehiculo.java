package com.jfxtext.model.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "TIPOVEHICULO")
@Data @NoArgsConstructor
public class TipoVehiculo implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID") 
	private @NonNull Integer id;
	@Column(name = "TIPO")
	private @NonNull String tipo;
	
}
