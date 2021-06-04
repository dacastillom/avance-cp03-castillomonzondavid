package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Auto;

public interface AutoService {

	public abstract List<Auto> listaAuto();
	public abstract Auto insertaActualizaAuto(Auto obj);
	public abstract Optional<Auto> obtienePorId(int idAuto);
	public abstract void eliminaAuto(int id);
	public abstract List<Auto> listaAutoPorNombreLike(String filtro);
	//public abstract List<Auto> obtienePorDni(String dni);
	
}
