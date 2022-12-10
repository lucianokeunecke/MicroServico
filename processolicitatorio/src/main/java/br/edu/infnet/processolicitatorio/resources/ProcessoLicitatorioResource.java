package br.edu.infnet.processolicitatorio.resources;

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

import br.edu.infnet.processolicitatorio.modelo.entidade.ProcessoLicitatorio;
import br.edu.infnet.processolicitatorio.modelo.service.ProcessoLicitatorioService;

@RestController
@RequestMapping("/processolicitatorio")
public class ProcessoLicitatorioResource {
	
	private static Logger log = LoggerFactory.getLogger(ProcessoLicitatorioResource.class);
	
	@Autowired
	private ProcessoLicitatorioService processoLicitatorioService;
	
    @PostMapping
    public void incluir(@RequestBody ProcessoLicitatorio processoLicitatorio){
    	
    	processoLicitatorioService.incluir(processoLicitatorio);
    }	
    
    @PutMapping("/{id}")
    public void alterar(@PathVariable  Long id, @RequestBody ProcessoLicitatorio processoLicitatorio){
    	processoLicitatorioService.alterar(id, processoLicitatorio);
    }
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable  Long id){
    	processoLicitatorioService.excluir(id);
    }    
	
	@GetMapping
	public ResponseEntity<List<ProcessoLicitatorio>> listarTodos(){
		
		log.info("Chamando a API ProcessoLicitatorio. Listando todos os processos licitatórios");
		
		return ResponseEntity.ok(processoLicitatorioService.listarTodos());
	}
	
	@GetMapping("/{id}")
	public ProcessoLicitatorio buscarPeloId(@PathVariable Long id) {
		
		log.info("Chamando a API ProcessoLicitatorio. Buscando os dados a partir do id: {}", id);
		
		return processoLicitatorioService.buscarPeloId(id);
	}	

}
