package com.api.ArquiteturaLimpa.Domain.Entity;

public class Endereco {
	private Pessoa pessoa;
	private String numero;
	private String rua;
	private String bairro;
	private String complemento;
	private String estado;
	private String cep;

	public Endereco() {
	}

	public Endereco(String numero, String rua, String bairro, String complemento, String estado, String cep) {
		super();
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco(Pessoa pessoa, String numero, String rua, String bairro, String complemento, String estado,
			String cep) {
		super();
		this.pessoa = pessoa;
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.estado = estado;
		this.cep = cep;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}