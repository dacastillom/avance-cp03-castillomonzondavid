package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Auto;
import com.empresa.repository.AutoRepository;


@Service
public class AutoServiceImpl implements AutoService{

	@Autowired
	private AutoRepository repository;
	
	@Override
	public List<Auto> listaAuto() {
		return repository.findAll();
	}

	@Override
	public Auto insertaActualizaAuto(Auto obj) {
		return repository.save(obj);
	}


	@Override
	public void eliminaAuto(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Auto> listaAutoPorNombreLike(String filtro) {
		return repository.listaAutoPorNombreLike(filtro);
	}

	@Override
	public Optional<Auto> obtienePorId(int idAuto) {

		return repository.findById(idAuto);
	}
	
}
