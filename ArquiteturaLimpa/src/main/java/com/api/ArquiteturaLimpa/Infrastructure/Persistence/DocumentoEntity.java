package com.api.ArquiteturaLimpa.Infrastructure.Persistence;

import com.api.ArquiteturaLimpa.Domain.Entity.Pessoa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_documento")
public class DocumentoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Pessoa pessoa;

	@Column
	private String tipo;

	@Column
	private String valor;

	public DocumentoEntity() {
	}
	
	public DocumentoEntity(String tipo, String valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public DocumentoEntity(long id, String tipo, String valor) {
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
		return "Documento [id=" + id + ", tipo=" + tipo + ", Valor=" + valor + "]";
	}
	
}