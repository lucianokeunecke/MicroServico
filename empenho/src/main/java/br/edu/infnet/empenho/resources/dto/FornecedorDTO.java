package br.edu.infnet.empenho.resources.dto;

public class FornecedorDTO {
	
    private Long id;
    
    private String nome;
    
    private String cnpjCpf;
    
    private String endereco;
    
    private long numeroEndereco;
    
    private String complementoEndereco;
    
    private String bairro;
    
    private long numeroCep;
    
    private String nomeCidade;
    
	public FornecedorDTO() {
		super();
	}

	public FornecedorDTO(Long id, String nome, String cnpjCpf, String endereco, long numeroEndereco,
			String complementoEndereco, String bairro, long numeroCep, String nomeCidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpjCpf = cnpjCpf;
		this.endereco = endereco;
		this.numeroEndereco = numeroEndereco;
		this.complementoEndereco = complementoEndereco;
		this.bairro = bairro;
		this.numeroCep = numeroCep;
		this.nomeCidade = nomeCidade;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpjCpf() {
		return cnpjCpf;
	}
	
	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public long getNumeroEndereco() {
		return numeroEndereco;
	}
	
	public void setNumeroEndereco(long numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	
	public String getComplementoEndereco() {
		return complementoEndereco;
	}
	
	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public long getNumeroCep() {
		return numeroCep;
	}
	
	public void setNumeroCep(long numeroCep) {
		this.numeroCep = numeroCep;
	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	@Override
	public String toString() {
		return "FornecedorDTO [id=" + id + ", nome=" + nome + ", cnpjCpf=" + cnpjCpf + ", endereco=" + endereco
				+ ", numeroEndereco=" + numeroEndereco + ", complementoEndereco=" + complementoEndereco + ", bairro="
				+ bairro + ", numeroCep=" + numeroCep + ", nomeCidade=" + nomeCidade + "]";
	}

}
