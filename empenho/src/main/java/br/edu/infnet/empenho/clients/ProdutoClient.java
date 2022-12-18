package br.edu.infnet.empenho.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.empenho.resources.dto.ProdutoCatalogoDTO;

@FeignClient("produto")
public interface ProdutoClient {
	
	@GetMapping("/produto")
	public ResponseEntity<List<ProdutoCatalogoDTO>> listarTodos();

}
