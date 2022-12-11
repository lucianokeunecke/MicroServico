package br.edu.infnet.empenho.resources.dto;

import java.util.List;

public class EmpenhoDTO {
	
	private Integer fornecedorId;
	
	private Integer processoLicitatorioId;

	private List<ProdutoDTO> listaProdutos;

	public Integer getFornecedorId() {
		return fornecedorId;
	}

	public void setFornecedorId(Integer fornecedorId) {
		this.fornecedorId = fornecedorId;
	}

	public Integer getProcessoLicitatorioId() {
		return processoLicitatorioId;
	}

	public void setProcessoLicitatorioId(Integer processoLicitatorioId) {
		this.processoLicitatorioId = processoLicitatorioId;
	}

	public List<ProdutoDTO> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<ProdutoDTO> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	@Override
	public String toString() {
		return "EmpenhoDTO [fornecedorId=" + fornecedorId + ", processoLicitatorioId=" + processoLicitatorioId
				+ ", listaProdutos=" + listaProdutos + "]";
	}

}


