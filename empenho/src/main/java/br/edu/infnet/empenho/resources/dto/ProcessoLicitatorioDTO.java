package br.edu.infnet.empenho.resources.dto;

import java.time.LocalDate;

public class ProcessoLicitatorioDTO {
	
    private Long id;
    private int numero;
    private LocalDate dataExpedicao;
    private String objetoLicitacao;
    private float valorEstimadoEdital;
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public LocalDate getDataExpedicao() {
		return dataExpedicao;
	}
	
	public void setDataExpedicao(LocalDate dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	
	public String getObjetoLicitacao() {
		return objetoLicitacao;
	}
	
	public void setObjetoLicitacao(String objetoLicitacao) {
		this.objetoLicitacao = objetoLicitacao;
	}
	
	public float getValorEstimadoEdital() {
		return valorEstimadoEdital;
	}
	
	public void setValorEstimadoEdital(float valorEstimadoEdital) {
		this.valorEstimadoEdital = valorEstimadoEdital;
	}
	
	@Override
	public String toString() {
		return "ProcessoLicitatorioDTO [id=" + id + ", numero=" + numero + ", dataExpedicao=" + dataExpedicao
				+ ", objetoLicitacao=" + objetoLicitacao + ", valorEstimadoEdital=" + valorEstimadoEdital + "]";
	}

}
