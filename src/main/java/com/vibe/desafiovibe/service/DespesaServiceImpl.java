package com.vibe.desafiovibe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vibe.desafiovibe.clients.interfaces.DespesaClient;
import com.vibe.desafiovibe.dto.DespesaDetalhesDTO;
import com.vibe.desafiovibe.service.interfaces.DespesaService;
import com.vibe.desafiovibe.utils.ParametrosConsulta;

@Service
public class DespesaServiceImpl implements DespesaService {

	@Autowired
	private DespesaClient despesaClient;
	
	@Override
	public List<DespesaDetalhesDTO> buscarDespesas(Long id, ParametrosConsulta parametros) {
		
		return despesaClient.buscarDespesas(id, parametros);
	}
}
