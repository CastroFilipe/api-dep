package com.vibe.desafiovibe.service.interfaces;

import java.util.List;

import com.vibe.desafiovibe.domain.Contador;

public interface ContadorService {

	/**
	 * Faz a busca de contadores para cada um dos ids presentes na lista passada como parâmetro.
	 * */
	public List<Contador> buscarContadores(List<Long> idsDeputados);
	
	/**
	 * Adiciona um novo contador na base de dados caso o parlamentar não tenha visualizações.
	 * */
	public Contador inserirNovo(Long idDeputado);

	/**
	 * Incrementa o contador de visualizações de um deputado.
	 * */
	public void incrementar(Contador contador);
	
}
