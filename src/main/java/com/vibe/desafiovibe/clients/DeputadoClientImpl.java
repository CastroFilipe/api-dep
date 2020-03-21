package com.vibe.desafiovibe.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vibe.desafiovibe.clients.interfaces.DeputadoClient;
import com.vibe.desafiovibe.dto.DadosDTO;
import com.vibe.desafiovibe.dto.DeputadoDTO;
import com.vibe.desafiovibe.dto.DeputadoDetalhesDTO;

@Service
public class DeputadoClientImpl implements DeputadoClient {
	
	@Autowired
	RestTemplate template;
	
	public List<DeputadoDTO> buscarDeputados(Integer pagina, Integer itens) {
		DadosDTO<List<DeputadoDTO>> dados = template.exchange(
				"https://dadosabertos.camara.leg.br/api/v2/deputados?pagina={pagina}&itens={itens}",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<DadosDTO<List<DeputadoDTO>>>() {},
				pagina,
				itens).getBody();
		
		return dados.getDados();
	}

	public DeputadoDetalhesDTO buscarDetalhes(Long id) {
		DadosDTO<DeputadoDetalhesDTO> dados = template.exchange(
				"https://dadosabertos.camara.leg.br/api/v2/deputados/{id}",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<DadosDTO<DeputadoDetalhesDTO>>() {},
				id).getBody();
		
		return dados.getDados();
	}
}
