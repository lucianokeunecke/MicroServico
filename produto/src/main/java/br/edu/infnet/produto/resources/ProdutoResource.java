package br.edu.infnet.produto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.produto.modelo.entidades.Produto;
import br.edu.infnet.produto.modelo.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getProdutos(){
		
		return ResponseEntity.ok(produtoService.listarTodos());
	}
	
	@GetMapping("/{id}")
	public Produto getCliente(@PathVariable Long id) {
		return produtoService.buscarPeloId(id);
	}	

}
