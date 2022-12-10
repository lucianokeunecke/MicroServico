package br.edu.infnet.produto.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.produto.modelo.entidades.Produto;
import br.edu.infnet.produto.modelo.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getAll(){
		return (List<Produto>) produtoRepository.findAll(); 
	}	
	
	public void incluirListaProdutosBancoDados() {
		
        Produto produto = new Produto( 1L, "cloridrato de tramal 50mg, ampola de 1ml", 15.6F);
        produtoRepository.save(produto);
        
        produto = new Produto( 5L, "cola para madeira 100g", 33.45F);
        produtoRepository.save(produto);

        produto = new Produto( 12L, "escada de fibra de vidro 7 degraus ", 96.15F);
        produtoRepository.save(produto);

        produto = new Produto( 15L, "escova de lavar roupa, formato anatômico, base com medidas mínimas de 11x6 cm, corpo (base) em plás", 34.5F);
        produtoRepository.save(produto);

        produto = new Produto( 26L, "espátula de inox para resina.", 9.99F);
        produtoRepository.save(produto);

        produto = new Produto( 31L, "espatula para manicure.", 1.6F);
        produtoRepository.save(produto);

        produto = new Produto( 33L, "espátula para resina composta.", 3.35F);
        produtoRepository.save(produto);

        produto = new Produto( 37L, "faca para lamina de cortador.", 6.36F);
        produtoRepository.save(produto);

        produto = new Produto( 39L, "extrato de tomate concentrado, embalagem com no mínimo 300g.", 12.3F);
        produtoRepository.save(produto);

        produto = new Produto( 41L, "extintor de incendio 5 anos, 02 kg.", 9.99F);
        produtoRepository.save(produto);

        produto = new Produto( 43L, "extensor elástico 2mt", 1.6F);
        produtoRepository.save(produto);

        produto = new Produto( 48L, "execução de passeio (calçada) em concreto (cimento/areia/seixorolado), praparo mecanico, espessura 7", 3.35F);
        produtoRepository.save(produto);

        produto = new Produto( 57L, "etinilestradiol 0,03mg + levonogestrel 0,15mg", 6.36F);
        produtoRepository.save(produto);

        produto = new Produto( 61L, "estetoscópio infantil simples.", 12.3F);
        produtoRepository.save(produto);

        produto = new Produto( 67L, "estante para arquivo, em madeira, nas medidas 2,70x0,36x3,10m.", 9.99F);
        produtoRepository.save(produto);		
	}	

}
