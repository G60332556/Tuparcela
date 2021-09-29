package com.compratuparcela.models.service;

import java.util.List;
import java.util.Optional;

import com.compratuparcela.models.entity.Lote;

public interface LoteService {
	public List<Lote>findAll();
	public Optional<Lote>findById(Integer id);
	public Lote save(Lote lote);
	public void deleteById(Integer id);
	
	
	
	

}
