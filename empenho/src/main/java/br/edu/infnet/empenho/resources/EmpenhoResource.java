package br.edu.infnet.empenho.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.edu.infnet.empenho.clients.ProdutoClient;

@RestController
@RequestMapping("/empenho")
public class EmpenhoResource {
	
	private static Logger log = LoggerFactory.getLogger(EmpenhoResource.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${processolicitatorio.endpoint.url}")
	private String processoLicitatorioApiUrl;
	
	@Autowired
	private ProdutoClient produtoClient;
	
	

}
