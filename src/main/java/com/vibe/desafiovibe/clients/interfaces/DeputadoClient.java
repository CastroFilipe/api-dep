package com.vibe.desafiovibe.clients.interfaces;

import java.util.List;

import com.vibe.desafiovibe.dto.DeputadoDTO;
import com.vibe.desafiovibe.dto.DeputadoDetalhesDTO;

public interface DeputadoClient {
	
	/**
	 * Faz a busca dos deputados.
	 * 
	 * @param pagina o número da página.
	 * @param itens a quantidade de itens por página.
	 * 
	 * @author Filipe
	 * */
	public List<DeputadoDTO> buscarDeputados(Integer pagina, Integer itens);
	
	/**
	 * Faz a busca detalhada das informações de uma deputado.
	 * 
	 * @param id o identificador do deputado
	 * 
	 * @author Filipe
	 * */
	public DeputadoDetalhesDTO buscarDetalhes(Long id);

}
