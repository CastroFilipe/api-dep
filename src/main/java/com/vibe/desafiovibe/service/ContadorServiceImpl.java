package com.vibe.desafiovibe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vibe.desafiovibe.domain.Contador;
import com.vibe.desafiovibe.repository.ContadorRepository;
import com.vibe.desafiovibe.service.interfaces.ContadorService;

@Service
public class ContadorServiceImpl implements ContadorService {
	
	@Autowired
	private ContadorRepository contadorRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Contador> buscarContadores(List<Long> idsDeputados) {
		return contadorRepository.find(idsDeputados);
	}

	@Override
	@Transactional
	public void incrementar(Long idDeputado) {
		Contador contador = contadorRepository.findByIdDeputado(idDeputado).orElse(new Contador());
		
		if(contador.getId() == null) {
			contador = new Contador(null, idDeputado, 1);
		} else {
			contador.setTotalVisitas(contador.getTotalVisitas()+1);
		}
		
		contadorRepository.save(contador);
	}
	
}
