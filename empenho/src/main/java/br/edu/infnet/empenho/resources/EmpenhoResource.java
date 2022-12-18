package br.edu.infnet.empenho.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.empenho.clients.ProdutoClient;
import br.edu.infnet.empenho.resources.dto.EmpenhoDTO;
import br.edu.infnet.empenho.resources.dto.EmpenhoResponseDTO;
import br.edu.infnet.empenho.resources.dto.FornecedorDTO;
import br.edu.infnet.empenho.resources.dto.ProcessoLicitatorioDTO;
import br.edu.infnet.empenho.resources.dto.ProdutoCatalogoDTO;

@RestController
@RequestMapping("/empenho")
public class EmpenhoResource {
	
	private static Logger log = LoggerFactory.getLogger(EmpenhoResource.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${processolicitatorio.endpoint.url}")
	private String processoLicitatorioApiUrl;
	
	@Value("${fornecedor.endpoint.url}")
	private String fornecedorApiUrl;	
	
	@Autowired
	private ProdutoClient produtoClient;
	
	@PostMapping
	public EmpenhoResponseDTO emitirEmpenho(@RequestBody EmpenhoDTO empenhoDTO) {
	
		log.info("Emissão do Empenho: {}", empenhoDTO);
		
		ProcessoLicitatorioDTO processoLicitatorioDTO = restTemplate.getForObject(processoLicitatorioApiUrl + empenhoDTO.getProcessoLicitatorioId(), ProcessoLicitatorioDTO.class);
		
		log.info("Chamada da api ProcessoLicitatorio: {}", processoLicitatorioDTO);
		
		FornecedorDTO fornecedorDTO = restTemplate.getForObject(fornecedorApiUrl + empenhoDTO.getFornecedorId(), FornecedorDTO.class);
		
		log.info("Chamada da api Fornecedor: {}", fornecedorDTO);
		
		ResponseEntity<List<ProdutoCatalogoDTO>> listaProdutos = produtoClient.listarTodos();
		
		log.info("Chamada da api Produto");
		
		return new EmpenhoResponseDTO(fornecedorDTO, processoLicitatorioDTO, listaProdutos.getBody());
	}
	

}
