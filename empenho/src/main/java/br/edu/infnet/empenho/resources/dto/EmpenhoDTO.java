package br.edu.infnet.empenho.resources.dto;

import java.util.List;

public class EmpenhoDTO {
	
	private Long fornecedorId;
	
	private Long processoLicitatorioId;

	private List<ProdutoDTO> listaProdutos;

	public Long getFornecedorId() {
		return fornecedorId;
	}

	public void setFornecedorId(Long fornecedorId) {
		this.fornecedorId = fornecedorId;
	}

	public Long getProcessoLicitatorioId() {
		return processoLicitatorioId;
	}

	public void setProcessoLicitatorioId(Long processoLicitatorioId) {
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


