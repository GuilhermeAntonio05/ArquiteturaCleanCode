package com.api.ArquiteturaLimpa.Domain.Entity;

public class Documento {
	private Pessoa pessoa;
	private String tipo;
	private String valor;
	
	public Documento() {
		super();
	}

	public Documento( String tipo, String valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public Documento(Pessoa pessoa, String tipo, String valor) {
		super();
		this.pessoa = pessoa;
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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
	
}
