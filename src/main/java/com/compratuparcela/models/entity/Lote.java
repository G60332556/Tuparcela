package com.compratuparcela.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lotes")
public class Lote {
	
	@Id
	@Column(name="id_lote")
	private Integer idLote;
	@Column(name="nombre_lote")
	private String nombre;
	@Column(name="descorta_lote")
	private String descorta;
	@Column(name="deslarga_lote")
	private String deslarga;
	@Column(name="valor_lote")
	private Double valor;
	@Column(name="direccion_lote")
	private String direccion;
	@Column(name="area_lote") 
	private Double area;
	public Integer getIdLote() {
		return idLote;
	}
	public void setIdLote(Integer idLote) {
		this.idLote = idLote;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescorta() {
		return descorta;
	}
	public void setDescorta(String descorta) {
		this.descorta = descorta;
	}
	public String getDeslarga() {
		return deslarga;
	}
	public void setDeslarga(String deslarga) {
		this.deslarga = deslarga;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", nombre=" + nombre + ", descorta=" + descorta + ", deslarga=" + deslarga
				+ ", valor=" + valor + ", direccion=" + direccion + ", area=" + area + "]";
	}
	
	
	

}
