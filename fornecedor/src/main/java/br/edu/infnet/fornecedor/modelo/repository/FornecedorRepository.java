package br.edu.infnet.fornecedor.modelo.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.fornecedor.modelo.entidade.Fornecedor;

public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {

}
