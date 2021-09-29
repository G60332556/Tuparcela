package com.compratuparcela.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compratuparcela.models.entity.Tipo;
import com.compratuparcela.repository.TipoRepository;

@Service
public class TipoServiceImpl implements TipoService {
	
	@Autowired
	private TipoRepository tipoRepository;
	

	@Override
	public List<Tipo> findAll() {
		// TODO Auto-generated method stub
		return tipoRepository.findAll();
	}

	@Override
	public Optional<Tipo> findById(Integer id) {
		// TODO Auto-generated method stub
		return tipoRepository.findById(id);
	}

	@Override
	public Tipo save(Tipo tipo) {
		// TODO Auto-generated method stub
		return tipoRepository.save(tipo);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		tipoRepository.deleteById(id);
		
	}

}
