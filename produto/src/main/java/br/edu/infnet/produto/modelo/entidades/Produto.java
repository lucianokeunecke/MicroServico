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
