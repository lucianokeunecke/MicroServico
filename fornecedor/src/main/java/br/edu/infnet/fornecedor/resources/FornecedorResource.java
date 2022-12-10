package br.edu.infnet.fornecedor.resources;

import java.util.List;

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

import br.edu.infnet.fornecedor.modelo.entidade.Fornecedor;
import br.edu.infnet.fornecedor.modelo.service.FornecedorService;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorResource {
	
	@Autowired
	private FornecedorService fornecedorService;
	
    @PostMapping
    public void incluir(@RequestBody Fornecedor fornecedor){
        fornecedorService.incluir(fornecedor);
    }	
    
    @PutMapping("/{id}")
    public void alterar(@PathVariable  Long id, @RequestBody Fornecedor fornecedor){
        fornecedorService.alterar(id, fornecedor);
    }
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable  Long id){
        fornecedorService.excluir(id);
    }    
	
	@GetMapping
	public ResponseEntity<List<Fornecedor>> listarTodos(){
		
		return ResponseEntity.ok(fornecedorService.listarTodos());
	}
	
	@GetMapping("/{id}")
	public Fornecedor buscarPeloId(@PathVariable Long id) {
		return fornecedorService.buscarPeloId(id);
	}	

}
