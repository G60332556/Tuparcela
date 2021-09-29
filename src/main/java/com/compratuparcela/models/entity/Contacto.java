package com.compratuparcela.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contactos")

public class Contacto {
	
	@Id
	@Column(name="id_contacto")
	private Integer idContacto;
	
	
	@Column(name="nombre_contacto")
	private String nombreContacto;
	
	@Column(name="correo_contacto")
	private String correoContacto;
	
	@Column(name="telefono_contacto")
	private String telefonoContacto;
	
	@Column(name="estado_contacto")
	private String estadoContacto;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_fk")
	private Tipo tipo;

	public Integer getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getCorreoContacto() {
		return correoContacto;
	}

	public void setCorreoContacto(String correoContacto) {
		this.correoContacto = correoContacto;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getEstadoContacto() {
		return estadoContacto;
	}

	public void setEstadoContacto(String estadoContacto) {
		this.estadoContacto = estadoContacto;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", nombreContacto=" + nombreContacto + ", correoContacto="
				+ correoContacto + ", telefonoContacto=" + telefonoContacto + ", estadoContacto=" + estadoContacto
				+ ", tipo=" + tipo + "]";
	}
	
	

}
