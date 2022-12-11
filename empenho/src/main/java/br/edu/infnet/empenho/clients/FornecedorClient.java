package br.edu.infnet.empenho.clients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.empenho.resources.dto.FornecedorDTO;

public interface FornecedorClient {
	
	@GetMapping("/{id}")
	public FornecedorDTO buscarPeloId(@PathVariable Long id);	

}
