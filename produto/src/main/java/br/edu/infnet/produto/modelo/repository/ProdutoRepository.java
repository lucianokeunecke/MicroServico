package br.edu.infnet.produto.modelo.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.produto.modelo.entidades.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
