package com.vibe.desafiovibe.service.interfaces;

import java.util.List;

import com.vibe.desafiovibe.dto.DespesaDetalhesDTO;
import com.vibe.desafiovibe.utils.ParametrosConsulta;

public interface DespesaService {
	
	/**
	 * Faz a busca detalhada das despesas de um parlamentar.
	 * 
	 * @param id O identificador do parlamentar.
	 * @param parametros Objeto contendo os parâmetros para a consulta.
	 * 
	 * @author Filipe
	 * */
	public List<DespesaDetalhesDTO> buscarDespesas(Long id, ParametrosConsulta parametros); 

}
