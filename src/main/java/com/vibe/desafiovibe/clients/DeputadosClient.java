package com.vibe.desafiovibe.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vibe.desafiovibe.dto.DadosDTO;
import com.vibe.desafiovibe.dto.DeputadoDTO;

@Service
public class DeputadosClient {
	
	@Autowired
	RestTemplate template;
	
	public List<DeputadoDTO> buscarDeputados(Integer pagina, Integer itens) {
		return template.getForObject(
				"https://dadosabertos.camara.leg.br/api/v2/deputados?pagina={pagina}&itens={itens}", 
				DadosDTO.class, 
				pagina,
				itens).getDados();
	}

}
