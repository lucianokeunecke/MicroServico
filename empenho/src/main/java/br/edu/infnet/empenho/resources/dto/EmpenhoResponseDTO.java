package br.edu.infnet.empenho.resources.dto;

import java.util.List;

public class EmpenhoResponseDTO {
	
	private FornecedorDTO fornecedor;
	
	private ProcessoLicitatorioDTO processoLicitatorio;
	
	private List<ProdutoCatalogoDTO> listaProdutos;

	public EmpenhoResponseDTO() {
		super();
	}

	public EmpenhoResponseDTO(FornecedorDTO fornecedor, ProcessoLicitatorioDTO processoLicitatorio, List<ProdutoCatalogoDTO> listaProdutos) {
		super();
		this.fornecedor = fornecedor;
		this.processoLicitatorio = processoLicitatorio;
		this.listaProdutos = listaProdutos;
	}

	public FornecedorDTO getFornecedor() {
		return fornecedor;
	}

	public ProcessoLicitatorioDTO getProcessoLicitatorio() {
		return processoLicitatorio;
	}

	public List<ProdutoCatalogoDTO> getListaProdutos() {
		return listaProdutos;
	}

}
