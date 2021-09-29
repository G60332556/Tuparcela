package com.compratuparcela.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compratuparcela.models.entity.Contacto;
import com.compratuparcela.repository.ContactoRepository;

@Service
public class ContactoServiceImpl implements ContactoService{
	
	@Autowired
	private ContactoRepository contactoRepository;
	

	@Override
	public List<Contacto> findAll() {
		// TODO Auto-generated method stub
		return contactoRepository.findAll();
	}

	@Override
	public Optional<Contacto> findById(Integer id) {
		// TODO Auto-generated method stub
		return contactoRepository.findById(id);
	}

	@Override
	public Contacto save(Contacto contacto) {
		// TODO Auto-generated method stub
		return contactoRepository.save(contacto);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		contactoRepository.deleteById(id);
		
	}

}
