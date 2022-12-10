package br.edu.infnet.produto.modelo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.produto.modelo.entidades.Produto;
import br.edu.infnet.produto.modelo.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
    public void incluir(Produto produto) {
        produtoRepository.save(produto);
    }
    
    public void alterar(Long id, Produto produto) {
    	Produto produtoSalvo = produtoRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(produto, produtoSalvo, "id");
        produtoRepository.save(produtoSalvo);
    }
    
    public void excluir(Long id) {
    	produtoRepository.deleteById(id);
    } 	
	
	public List<Produto> listarTodos(){
		return (List<Produto>) produtoRepository.findAll(); 
	}
	
	public Produto buscarPeloId(Long id) {
		Produto produto = produtoRepository.findById(id).get();
		return produto;
	}	

}
