package com.empresa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Auto;
import com.empresa.service.AutoService;

	@RestController
	@RequestMapping("/rest/auto")
	public class AutoController {

	@Autowired
	private AutoService service;
	

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Auto>> listaAuto(){
	List<Auto> lista = service.listaAuto(); 
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/porId/{id}")
	@ResponseBody
	public ResponseEntity<Auto> listaPorId(@PathVariable("id") int idAuto) {
		Optional<Auto> optAuto= service.obtienePorId(idAuto);
		if (optAuto.isPresent()) {
			return ResponseEntity.ok(optAuto.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	
	
	
	@RequestMapping("/consultaCrudAuto")
	@ResponseBody
	public List<Auto> lista(String filtro) {
		return service.listaAutoPorNombreLike(filtro.trim() + "%");
	}
	
	
	
	
}
