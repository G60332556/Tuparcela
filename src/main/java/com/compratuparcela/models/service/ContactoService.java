package com.compratuparcela.models.service;

import java.util.List;
import java.util.Optional;

import com.compratuparcela.models.entity.Contacto;

public interface ContactoService {
	
	public List<Contacto>findAll();
	public Optional<Contacto>findById(Integer id);
	public Contacto save (Contacto contacto);
	public void deleteById(Integer id);

}
