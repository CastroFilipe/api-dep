package com.vibe.desafiovibe.clients.interfaces;

import java.util.List;

import com.vibe.desafiovibe.dto.DespesaDetalhesDTO;
import com.vibe.desafiovibe.utils.ParametrosConsulta;

public interface DespesaClient {

	/**
	 * Faz a busca das despesas detalhadas de um parlamentar.
	 * 
	 * @param id o identificador do parlamentar.
	 * @param parametros Objeto contendo os parâmetros para a consulta.
	 * */
	public List<DespesaDetalhesDTO> buscarDespesas(Long id, ParametrosConsulta parametros);
}
