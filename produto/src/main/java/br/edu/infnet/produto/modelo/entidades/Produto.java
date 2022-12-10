package br.edu.infnet.produto.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long codigo;
    private String descricao;
    private float valor;

    public Produto(Long codigo, String descricao, float valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(Long id, Long codigo, String descricao, float valor) {
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto() {

    }

    public Long getId() {
        return id;
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

	public void setId(Long id) {
		this.id = id;
	}

	@Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }	
	
}
