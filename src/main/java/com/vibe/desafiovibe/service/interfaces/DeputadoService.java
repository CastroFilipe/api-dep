package com.vibe.desafiovibe.service.interfaces;

import java.util.List;

import com.vibe.desafiovibe.dto.DeputadoDTO;

public interface DeputadoService {
	
	/**
	 * Retorna as informações básicas dos deputados.
	 * 
	 * @param pagina o número da página.
	 * @param itens quantidade de itens por página
	 * 
	 * */
	public List<DeputadoDTO> buscarDeputados(Integer pagina, Integer itens);
}
