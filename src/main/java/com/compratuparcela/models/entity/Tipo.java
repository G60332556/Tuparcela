package com.compratuparcela.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos")
public class Tipo {
	
	@Id
	@Column(name = "id_tipo")
	private Integer idTipo;
	
	@Column(name = "descripcion_tipo")
	private String descripcionTipo;

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public String getDescripcionTipo() {
		return descripcionTipo;
	}

	public void setDescripcionTipo(String descripcionTipo) {
		this.descripcionTipo = descripcionTipo;
	}

	@Override
	public String toString() {
		return "Tipo [idTipo=" + idTipo + ", descripcionTipo=" + descripcionTipo + "]";
	}
	
	
	
	
	
	

}
