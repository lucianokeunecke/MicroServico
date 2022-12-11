package br.edu.infnet.empenho.resources.dto;

import java.util.List;

public class EmpenhoResponseDTO {
	
	private FornecedorDTO fornecedor;
	
	private ProcessoLicitatorioDTO processoLicitatorio;
	
	private List<ProdutoDTO> listaProdutos;

	public EmpenhoResponseDTO() {
		
	}

	public EmpenhoResponseDTO(FornecedorDTO fornecedor, ProcessoLicitatorioDTO processoLicitatorio, List<ProdutoDTO> listaProdutos) {
		super();
		this.fornecedor = fornecedor;
		this.processoLicitatorio = processoLicitatorio;
		this.listaProdutos = listaProdutos;
	}

}
