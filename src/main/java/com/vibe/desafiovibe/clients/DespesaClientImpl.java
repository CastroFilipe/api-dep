package com.vibe.desafiovibe.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.vibe.desafiovibe.clients.interfaces.DespesaClient;
import com.vibe.desafiovibe.dto.DadosDTO;
import com.vibe.desafiovibe.dto.DespesaDetalhesDTO;
import com.vibe.desafiovibe.utils.ParametrosConsulta;

public class DespesaClientImpl implements DespesaClient {
	
	private static final String baseUrl = "https://dadosabertos.camara.leg.br/api/v2/deputados";
	
	@Autowired
	private RestTemplate template;

	@Override
	public List<DespesaDetalhesDTO> buscarDespesas(Long id, ParametrosConsulta parametros) {
		DadosDTO<List<DespesaDetalhesDTO>> dados = template.exchange(
				baseUrl.concat("/{id}/despesas?pagina={pagina}&itens={itens}&ano={ano}"
						+ "&mes={mes}&ordem={ordem}&ordenarPor={ordenarPor}"),
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<DadosDTO<List<DespesaDetalhesDTO>>>() {},
				id,
				parametros.getPagina(),
				parametros.getItens(),
				parametros.getAno(),
				parametros.getMes(),
				parametros.getOrdem(),
				parametros.getOrdenarPor()).getBody();
		
		return dados.getDados();
	}

}
