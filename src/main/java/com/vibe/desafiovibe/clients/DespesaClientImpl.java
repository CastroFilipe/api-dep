package com.vibe.desafiovibe.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.vibe.desafiovibe.clients.interfaces.DespesaClient;
import com.vibe.desafiovibe.dto.DadosDTO;
import com.vibe.desafiovibe.dto.DespesaDetalhesDTO;

public class DespesaClientImpl implements DespesaClient {
	
	@Autowired
	private RestTemplate template;

	@Override
	public List<DespesaDetalhesDTO> buscarDespesas(Long id) {
		DadosDTO<List<DespesaDetalhesDTO>> dados = template.exchange(
				"https://dadosabertos.camara.leg.br/api/v2/deputados/{id}/despesas",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<DadosDTO<List<DespesaDetalhesDTO>>>() {},
				id).getBody();
		
		return dados.getDados();
	}

}
