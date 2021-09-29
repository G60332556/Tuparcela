package com.compratuparcela.models.service;

import java.util.List;
import java.util.Optional;

import com.compratuparcela.models.entity.Tipo;

public interface TipoService {
	
	public List<Tipo>findAll();
	public Optional<Tipo>findById(Integer id);
	public Tipo save(Tipo tipo);
	public void deleteById(Integer id);
	

}
