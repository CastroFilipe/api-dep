package com.vibe.desafiovibe.dto;

import java.io.Serializable;
import java.util.List;

public class DadosDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<DeputadoDTO> dados;
	
	private List<LinkDTO> links;
	
	public List<DeputadoDTO> getDados() {
		return dados;
	}

	public void setDados(List<DeputadoDTO> dados) {
		this.dados = dados;
	}

	public List<LinkDTO> getLinks() {
		return links;
	}

	public void setLinks(List<LinkDTO> links) {
		this.links = links;
	}

}