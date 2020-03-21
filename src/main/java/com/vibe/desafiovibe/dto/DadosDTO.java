package com.vibe.desafiovibe.dto;

import java.util.List;

/**
 * Classe utilizada para receber os dados das requisições feitas na API da camara legislativa.
 * 
 * @author Filipe
 * */
public class DadosDTO<T> {

	private T dados;
	
	private List<LinkDTO> links;

	public T getDados() {
		return dados;
	}

	public void setDados(T dados) {
		this.dados = dados;
	}

	public List<LinkDTO> getLinks() {
		return links;
	}

	public void setLinks(List<LinkDTO> links) {
		this.links = links;
	}

}