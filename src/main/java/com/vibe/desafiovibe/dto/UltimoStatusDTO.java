package com.vibe.desafiovibe.dto;

import java.io.Serializable;

public class UltimoStatusDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String siglaPartido;
	
	private String urlFoto;

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	
}
