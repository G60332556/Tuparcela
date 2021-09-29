package com.compratuparcela.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "solicitudes")
public class Solicitud {
	
	@Id
	@Column(name="id_solicitud")
	private Integer idSolicitud;
	@Column(name="nombre_solicitante")
	private String nombre;
	@Column(name="correo_solicitante")
	private String correo;
	@Column(name="telefono_solicitante")
	private Integer telefono;
	@Column(name="descripcion_solicitud")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="id_lote_fk")
	private Lote lote;

	public Integer getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	@Override
	public String toString() {
		return "Solicitud [idSolicitud=" + idSolicitud + ", nombre=" + nombre + ", correo=" + correo + ", telefono="
				+ telefono + ", descripcion=" + descripcion + ", lote=" + lote + "]";
	}

	
	
		
	

}
