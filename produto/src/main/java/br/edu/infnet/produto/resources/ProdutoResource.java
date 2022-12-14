package br.edu.infnet.produto.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.produto.modelo.entidades.Produto;
import br.edu.infnet.produto.modelo.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {
	
	private static Logger log = LoggerFactory.getLogger(ProdutoResource.class);
	
	@Autowired
	private ProdutoService produtoService;
	
    @PostMapping
    public void incluir(@RequestBody Produto produto){
        produtoService.incluir(produto);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable  Long id, @RequestBody Produto produto){
        produtoService.alterar(id, produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable  Long id){
        produtoService.excluir(id);
    }	
	
	@GetMapping
	public ResponseEntity<List<Produto>> listarTodos(){
		
		log.info("Chamando a API Produto. Listando todos os produtos");
		
		return ResponseEntity.ok(produtoService.listarTodos());
	}
	
	@GetMapping("/{id}")
	public Produto buscarPeloId(@PathVariable Long id) {
		
		log.info("Chamando a API Produto. Buscando os dados a partir do id: {}", id);
		
		return produtoService.buscarPeloId(id);
	}	

}
