package com.vibe.desafiovibe.service.interfaces;

import java.util.List;

import com.vibe.desafiovibe.dto.DeputadoDTO;
import com.vibe.desafiovibe.dto.DeputadoDetalhesDTO;

public interface DeputadoService {
	
	/**
	 * Retorna as informações básicas dos deputados.
	 * 
	 * @param pagina o número da página.
	 * @param itens quantidade de itens por página.
	 * 
	 * @author Filipe
	 * */
	public List<DeputadoDTO> buscarDeputados(Integer pagina, Integer itens);
	
	/**
	 * Retorna as informações detalhadas de um Deputado.
	 * 
	 * @param id o identificador do parlamentar.
	 * 
	 * @author Filipe
	 * */
	public DeputadoDetalhesDTO buscarDetetalhes(Long id);
}
