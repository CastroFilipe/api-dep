package com.vibe.desafiovibe.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/deputados")
public class DeputadoResource {

	@Autowired
	DeputadoService deputadoService;
	
	@Autowired
	DespesaService despesaService;

	@GetMapping
	public ResponseEntity<List<DeputadoDTO>> buscarDeputados(
			@RequestParam(value = "pagina", defaultValue = "1", required = false) Integer pagina,
			@RequestParam(value = "itens", defaultValue = "5", required = false) Integer itens) {

		return ResponseEntity.ok().body(deputadoService.buscarDeputados(pagina, itens));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DeputadoDetalhesDTO> buscarDetalhes(@PathVariable Long id) {

		return ResponseEntity.ok().body(deputadoService.buscarDetetalhes(id));
	}
	
	@GetMapping("/{id}/despesas")
	public ResponseEntity<List<DespesaDetalhesDTO>> buscarDespesas(
			@PathVariable Long id,
			@RequestParam(value = "pagina", defaultValue = "1", required = false) Integer pagina,
			@RequestParam(value = "itens", defaultValue = "10", required = false) Integer itens,
			@RequestParam(value = "ano", defaultValue = "2019", required = false) Integer ano,
			@RequestParam(value = "mes", defaultValue = "1", required = false) Integer mes,
			@RequestParam(value = "ordem", defaultValue = "DESC", required = false) String ordem, 
			@RequestParam(value = "ordenarPor", defaultValue = "dataDocumento", required = false) String ordenarPor) {
		
		ParametrosConsulta parametros = new ParametrosConsulta(pagina, itens, ano, mes, ordem, ordenarPor);
		
		return ResponseEntity.ok().body(despesaService.buscarDespesas(id, parametros));
	}
}
