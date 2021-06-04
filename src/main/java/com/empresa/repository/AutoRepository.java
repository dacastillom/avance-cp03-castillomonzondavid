package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Auto;

public interface AutoRepository extends JpaRepository<Auto, Integer> {
	@Query("Select a from Auto a where nombre like :fil")
	public abstract List<Auto> listaAutoPorNombreLike(@Param("fil") String filtro);
	
	
}
