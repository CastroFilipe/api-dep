package com.vibe.desafiovibe.dto;

import java.util.List;

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