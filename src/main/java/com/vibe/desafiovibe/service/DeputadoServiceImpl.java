package com.vibe.desafiovibe.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vibe.desafiovibe.clients.DeputadoClientImpl;
import com.vibe.desafiovibe.domain.Contador;
import com.vibe.desafiovibe.dto.DeputadoDTO;
import com.vibe.desafiovibe.dto.DeputadoDetalhesDTO;
import com.vibe.desafiovibe.service.interfaces.ContadorService;
import com.vibe.desafiovibe.service.interfaces.DeputadoService;

@Service
public class DeputadoServiceImpl implements DeputadoService {
	
	@Autowired
	private DeputadoClientImpl deputadoClientImpl;
	
	@Autowired
	private ContadorService contadorService;

	@Override
	public List<DeputadoDTO> buscarDeputados(Integer pagina, Integer itens) {
		List<DeputadoDTO> deputados = deputadoClientImpl.buscarDeputados(pagina, itens);
		
		//pega os ids de todos os deputados retornados.
		List<Long> idsDeputados = deputados.parallelStream().map(d -> {
			return d.getId();
		}).collect(Collectors.toList());
		
		List<Contador> contadores = contadorService.buscarContadores(idsDeputados);
		
		return vincularTotalVisitas(deputados, contadores); 
	}
	
	@Override
	@Transactional
	public DeputadoDetalhesDTO buscarDetetalhes(Long id) {
		contadorService.incrementar(id);
		return deputadoClientImpl.buscarDetalhes(id);
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
