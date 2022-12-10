package br.edu.infnet.fornecedor.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.fornecedor.modelo.entidade.Fornecedor;
import br.edu.infnet.fornecedor.modelo.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	public List<Fornecedor> listarTodos(){
		return (List<Fornecedor>) fornecedorRepository.findAll(); 
	}
	
	public Fornecedor buscarPeloId(Long id) {
		Fornecedor fornecedor = fornecedorRepository.findById(id).get();
		return fornecedor;
	}	

}
