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

import com.compratuparcela.models.entity.Tipo;
import com.compratuparcela.models.service.TipoService;

@RestController
@RequestMapping("/api/tipos")
public class TipoController {
	
	@Autowired
	private TipoService tipoService;
	
	@GetMapping("{id}")
	public Optional<Tipo> buscarPorId(@PathVariable Integer id){
		return tipoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Tipo> listar(){
		return tipoService.findAll();
	}
	
	@PostMapping
	public Tipo guardar(@RequestBody Tipo tipo) {
		return tipoService.save(tipo);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		tipoService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Tipo actualizar(@RequestBody Tipo tipo, @PathVariable Integer id) {
		Tipo tipEnBD = tipoService.findById(id).get();
		
		tipEnBD.setDescripcionTipo(tipo.getDescripcionTipo());
		
		tipoService.save(tipEnBD);
		return tipo;
	}

}
