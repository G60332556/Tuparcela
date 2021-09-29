package com.compratuparcela.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compratuparcela.models.entity.Lote;
import com.compratuparcela.repository.LoteRepository;


@Service
public class LoteServiceImpl implements LoteService{
	
	@Autowired
	private LoteRepository loteRepository;

	@Override
	public List<Lote> findAll() {
		
		return loteRepository.findAll();
	}

	@Override
	public Optional<Lote> findById(Integer id) {
		
		return loteRepository.findById(id);
	}

	@Override
	public Lote save(Lote lote) {
		
		return loteRepository.save(lote);
	}

	@Override
	public void deleteById(Integer id) {
		loteRepository.deleteById(id);
	}


	


}
