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

import com.compratuparcela.models.entity.Solicitud;
import com.compratuparcela.models.service.SolicitudService;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {
	
	@Autowired
	private SolicitudService solicitudService;
	
	@GetMapping("{id}")
	public Optional<Solicitud> buscarPorId(@PathVariable Integer id){
		return solicitudService.findById(id);
					
	}
	
	
	@GetMapping("/listar")
	public List<Solicitud> Listar(){
		return solicitudService.findAll();
	}
	@PostMapping
	
	public Solicitud guardar(@RequestBody Solicitud solicitud) {
		
		return solicitudService.save(solicitud);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		solicitudService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Solicitud actualizar(@RequestBody Solicitud solicitud , @PathVariable Integer id) {
		Solicitud eEnBD= solicitudService.findById(id).get();
		
	
		eEnBD.setNombre(solicitud.getNombre());
		eEnBD.setCorreo(solicitud.getCorreo());
		eEnBD.setTelefono(solicitud.getTelefono());
		eEnBD.setDescripcion(solicitud.getDescripcion());
		eEnBD.setLote(solicitud.getLote());
		
		
		
		solicitudService.save(eEnBD);
		return solicitud;
		
		
		
		
		
		
		
		
	}
	
	
		
	}
	
	
	
	


