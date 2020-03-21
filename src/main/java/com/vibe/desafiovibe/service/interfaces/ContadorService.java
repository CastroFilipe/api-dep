package com.vibe.desafiovibe.service.interfaces;

import java.util.List;

import com.vibe.desafiovibe.domain.Contador;

public interface ContadorService {

	/**
	 * Faz a busca de contadores para cada um dos ids presentes na lista passada como parâmetro.
	 * */
	public List<Contador> buscarContadores(List<Long> idsDeputados);
	
	/**
	 * Incrementa o contador de visualizações de um deputado quando o parlamentar receber uma visualização.
	 * Se o parlamentar não possuir visualizações então será adicionado um novo contador na base de dados.
	 * A partir disso, a cada nova visualização será incrementado o valor do contador já existente.
	 * */
	public void incrementar(Long idDeputado);
	
}
