package com.compratuparcela.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compratuparcela.models.entity.Contacto;
import com.compratuparcela.models.service.ContactoService;

@RestController
@RequestMapping("/api/contactos")
public class ContactoController {
	
	@Autowired
	private ContactoService contactoService;
	
	@GetMapping("{id}")
	public Optional<Contacto> buscarPorId(@PathVariable Integer id){
		return contactoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Contacto> listar(){
		return contactoService.findAll();
	}
	
	@PostMapping
	public Contacto guardar(@RequestBody Contacto contacto) {
		return contactoService.save(contacto);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		contactoService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Contacto actualizar(@RequestBody Contacto contacto, @PathVariable Integer id) {
		Contacto conEnBD=contactoService.findById(id).get();
		
		conEnBD.setNombreContacto(contacto.getNombreContacto());
		conEnBD.setCorreoContacto(contacto.getCorreoContacto());
		conEnBD.setTelefonoContacto(contacto.getTelefonoContacto());
		conEnBD.setEstadoContacto(contacto.getEstadoContacto());
		conEnBD.setTipo(contacto.getTipo());
		
		contactoService.save(conEnBD);
		return contacto;
	}

}
