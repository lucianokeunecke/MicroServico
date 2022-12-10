package br.edu.infnet.processolicitatorio.modelo.entidade;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProcessoLicitatorio {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private LocalDate dataExpedicao;
    private String objetoLicitacao;
    private float valorEstimadoEdital;	
    
    public ProcessoLicitatorio() {

    }
    
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
        return "ProcessoLicitatorio{" +
                "id=" + id +
                ", numero=" + numero +
                ", dataExpedicao=" + dataExpedicao +
                ", objetoLicitacao='" + objetoLicitacao + '\'' +
                ", valorEstimadoEdital=" + valorEstimadoEdital +
                '}';
    }    

}
