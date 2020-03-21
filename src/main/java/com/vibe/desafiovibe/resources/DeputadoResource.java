package com.vibe.desafiovibe.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vibe.desafiovibe.dto.DeputadoDTO;
import com.vibe.desafiovibe.dto.DeputadoDetalhesDTO;
import com.vibe.desafiovibe.dto.DespesaDetalhesDTO;
import com.vibe.desafiovibe.service.interfaces.DeputadoService;
import com.vibe.desafiovibe.service.interfaces.DespesaService;
import com.vibe.desafiovibe.utils.ParametrosConsulta;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/deputados")
public class DeputadoResource {

	@Autowired
	DeputadoService deputadoService;
	
	@Autowired
	DespesaService despesaService;
	
	@ApiOperation(value="Busca as informações básicas dos deputados", notes="Retorna uma lista com informações de parlamentares")
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DeputadoDTO>> buscarDeputados(
			@RequestParam(value="pagina", defaultValue = "1", required = false) Integer pagina,
			@RequestParam(value = "itens", defaultValue = "5", required = false) Integer itens) {

		return ResponseEntity.ok().body(deputadoService.buscarDeputados(pagina, itens));
	}
	
	@ApiOperation(value="Busca as informações detalhadas de um parlamentar", notes="ids para teste: 204554, 204507")
	@GetMapping(value = "/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DeputadoDetalhesDTO> buscarDetalhes(@PathVariable Long id) {

		return ResponseEntity.ok().body(deputadoService.buscarDetetalhes(id));
	}
	
	@ApiOperation(value="Busca as despesas em detalhes de um parlamentar", notes="ids para teste: 204554, 204507")
	@GetMapping(value = "/{id}/despesas", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DespesaDetalhesDTO>> buscarDespesas(
			@PathVariable Long id,
			@RequestParam(value = "pagina", defaultValue = "1", required = false) Integer pagina,
			@RequestParam(value = "itens", defaultValue = "10", required = false) Integer itens,
			@RequestParam(value = "ano", defaultValue = "2020", required = false) Integer ano,
			@RequestParam(value = "mes", defaultValue = "1", required = false) Integer mes,
			@RequestParam(value = "ordem", defaultValue = "DESC", required = false) String ordem, 
			@RequestParam(value = "ordenarPor", defaultValue = "dataDocumento", required = false) String ordenarPor) {
		
		ParametrosConsulta parametros = new ParametrosConsulta(pagina, itens, ano, mes, ordem, ordenarPor);
		
		return ResponseEntity.ok().body(despesaService.buscarDespesas(id, parametros));
	}
}
