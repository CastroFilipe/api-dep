package com.vibe.desafiovibe.clients.interfaces;

import java.util.List;

import com.vibe.desafiovibe.dto.DespesaDetalhesDTO;

public interface DespesaClient {

	/**
	 * Faz a busca das despesas detalhadas de um parlamentar.
	 * 
	 * @param id o identificador do parlamentar.
	 * @param mes o mes de consulta.
	 * */
	public List<DespesaDetalhesDTO> buscarDespesas(Long id);
}
