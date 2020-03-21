package com.vibe.desafiovibe.utils;

/**
 * Classe auxiliar para transferências dos parâmetros utilizados nas consultas
 * 
 * @author Filipe
 * */
public class ParametrosConsulta {

	private Integer pagina;

	private Integer itens;

	private Integer ano;

	private Integer mes;
	
	private String ordem;
	
	private String ordenarPor;
	
	public ParametrosConsulta(Integer pagina, Integer itens, Integer ano, Integer mes, String ordem,
			String ordenarPor) {
		super();
		this.pagina = pagina;
		this.itens = itens;
		this.ano = ano;
		this.mes = mes;
		this.ordem = ordem;
		this.ordenarPor = ordenarPor;
	}

	public Integer getPagina() {
		return pagina;
	}

	public Integer getItens() {
		return itens;
	}

	public Integer getAno() {
		return ano;
	}

	public Integer getMes() {
		return mes;
	}

	public String getOrdem() {
		return ordem;
	}

	public String getOrdenarPor() {
		return ordenarPor;
	}

}
