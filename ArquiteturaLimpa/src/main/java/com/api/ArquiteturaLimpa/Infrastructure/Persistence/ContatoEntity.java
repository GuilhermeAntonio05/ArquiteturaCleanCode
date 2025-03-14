package com.api.ArquiteturaLimpa.Infrastructure.Persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_contato")
public class ContatoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private PessoaEntity pessoa;
	
	@Column
	private String tipo;

	@Column
	private String valor;

	public ContatoEntity() {
	}

	public ContatoEntity(String tipo, String valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public ContatoEntity(long id, String tipo, String valor) {
		this.id = id;
		this.tipo = tipo;
		this.valor = valor;
	}

	public long getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", tipo=" + tipo + ", Valor=" + valor + "]";
	}

}
