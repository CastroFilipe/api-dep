package com.vibe.desafiovibe.service.interfaces;

import java.util.List;

import com.vibe.desafiovibe.dto.DespesaDetalhesDTO;

public interface DespesaService {
	
	public List<DespesaDetalhesDTO> buscarDespesas(Long id); 

}
