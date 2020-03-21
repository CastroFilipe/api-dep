package com.vibe.desafiovibe.dto;

import java.io.Serializable;

public class DespesaDetalhesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String tipoDespesa;
	
	private String tipoDocumento;
	
	private String dataDocumento;
	
	private String valorLiquido;

	public String getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(String dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public String getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(String valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	
}
