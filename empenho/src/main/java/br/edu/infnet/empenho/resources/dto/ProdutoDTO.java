package br.edu.infnet.empenho.resources.dto;

public class ProdutoDTO {
	
    private Long id;
    private Long codigo;
    private String descricao;
    private float valor;
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ProdutoDTO [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + "]";
	}

}
