package com.vibe.desafiovibe.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vibe.desafiovibe.domain.Contador;

public interface ContadorRepository extends JpaRepository<Contador, Long> {
	
	@Query("SELECT c FROM Contador c "
			+ "WHERE c.idDeputado IN (:idsDeputados)")
	List<Contador> find(List<Long> idsDeputados);
	
	@Query("SELECT c FROM Contador c "
			+ "WHERE c.idDeputado = :idDeputado")
	Optional<Contador> findByIdDeputado(Long idDeputado);
}
