package com.compratuparcela.models.service;

import java.util.List;
import java.util.Optional;

import com.compratuparcela.models.entity.Solicitud;

public interface SolicitudService {
	
	public List<Solicitud>findAll();
	public Optional<Solicitud>findById(Integer id);
	public Solicitud save(Solicitud solicitud);
	public void deleteById(Integer id);
	

}
