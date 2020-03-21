package com.vibe.desafiovibe.dto;

import java.io.Serializable;

public class DeputadoDetalhesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nomeCivil;
	
	private String dataNascimento;
	
	private String sexo;
	
	private UltimoStatusDTO ultimoStatus;

	public String getNomeCivil() {
		return nomeCivil;
	}

	public void setNomeCivil(String nomeCivil) {
		this.nomeCivil = nomeCivil;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public UltimoStatusDTO getUltimoStatus() {
		return ultimoStatus;
	}

	public void setUltimoStatus(UltimoStatusDTO ultimoStatus) {
		this.ultimoStatus = ultimoStatus;
	}
	
}
