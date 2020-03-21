package com.vibe.desafiovibe.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vibe.desafiovibe.clients.DeputadosClient;
import com.vibe.desafiovibe.domain.Contador;
import com.vibe.desafiovibe.dto.DeputadoDTO;
import com.vibe.desafiovibe.repository.ContadorRepository;
import com.vibe.desafiovibe.service.interfaces.DeputadoService;

@Service
public class DeputadoServiceImpl implements DeputadoService {
	
	@Autowired
	private ContadorRepository contadorRepository;
	
	@Autowired
	private DeputadosClient deputadosClient;

	@Override
	public List<DeputadoDTO> buscarDeputados(Integer pagina, Integer itens) {
		List<DeputadoDTO> deputados = deputadosClient.buscarDeputados(pagina, itens);
		
		//pega os ids de todos os deputados retornados.
		List<Long> idsDeputados = deputados.parallelStream().map(d -> {
			return d.getId();
		}).collect(Collectors.toList());
		
		List<Contador> contadores = buscarContadores(idsDeputados);
		
		return vincularTotalVisitas(deputados, contadores); 
	}
	
	@Transactional(readOnly = true)
	private List<Contador> buscarContadores(List<Long> idsDeputados){
		return contadorRepository.buscarContadores(idsDeputados);
	}
	
	private List<DeputadoDTO> vincularTotalVisitas(List<DeputadoDTO> deputados, List<Contador> contadores){
		deputados.forEach(deputado -> {
			Integer totalVisitas;
			totalVisitas = contadores.stream().filter(c -> deputado.getId().equals(c.getIdDeputado())).
					map(Contador::getTotalVisitas)
					.findFirst().orElse(0);
			
			deputado.setVisualizacoes(totalVisitas);
		});
		
		return deputados; 
	}
}
