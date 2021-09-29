package com.compratuparcela.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compratuparcela.models.entity.Solicitud;
import com.compratuparcela.repository.SolicitudRepository;

@Service
public class SolicitudServiceImpl implements SolicitudService{
	
	@Autowired
	private SolicitudRepository solicitudRepository;

	@Override
	public List<Solicitud> findAll() {
		
		return solicitudRepository.findAll();
	}

	@Override
	public Optional<Solicitud> findById(Integer id) {
		
		return solicitudRepository.findById(id);
	}

	@Override
	public Solicitud save(Solicitud solicitud) {
		
		return solicitudRepository.save(solicitud);
	}

	@Override
	public void deleteById(Integer id) {
		
		solicitudRepository.deleteById(id);
		
	}
	
	

	

}
