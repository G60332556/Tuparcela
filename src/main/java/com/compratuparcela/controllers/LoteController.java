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

import com.compratuparcela.models.entity.Lote;
import com.compratuparcela.models.service.LoteService;


@RestController
@RequestMapping("/api/lotes")

public class LoteController {
	
	@Autowired
	private LoteService loteService;
	
	@GetMapping("{id}")
	public Optional<Lote> buscarPorId(@PathVariable Integer id){
		
		return loteService.findById(id);
			
	}
	
	@GetMapping("/listar")
	public List<Lote> Listar(){
		return loteService.findAll();
	}
	

	@PostMapping
	
	public Lote guardar(@RequestBody Lote lote) {
		
		return loteService.save(lote);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		loteService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Lote actualizar(@RequestBody Lote lote , @PathVariable Integer id) {
		Lote eEnBD= loteService.findById(id).get();
		
	
		eEnBD.setNombre(lote.getNombre());
		eEnBD.setDescorta(lote.getDescorta());
		eEnBD.setDeslarga(lote.getDeslarga());
		eEnBD.setValor(lote.getValor());
		eEnBD.setDireccion(lote.getDireccion());
		eEnBD.setArea(lote.getArea());
		
		
		loteService.save(eEnBD);
		return lote;
		
		
		
		
		
		
		
		
	}
	
}
