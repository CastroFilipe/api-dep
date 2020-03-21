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
		return contadorRepository.buscarContadores(idsDeputados);
	}

	@Override
	public Contador inserirNovo(Long idDeputado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incrementar(Contador contador) {
		// TODO Auto-generated method stub	
	}

}
