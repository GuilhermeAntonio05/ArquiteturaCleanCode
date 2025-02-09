package com.api.ArquiteturaLimpa.Domain.Entity;

public class Pessoa {
	private String nome;
//	private Setor setor;
//	private List<Contato> contato;
//	private List<Endereco> endereco;
//	private List<Documento> documento;
	private double salario;
	private String dataNascimento;
	private String inscricaoFederal;
	
	public Pessoa() {
	}

	public Pessoa(String nome, 
		//	Setor setor, List<Contato> contato, List<Endereco> endereco, List<Documento> documento,
			double salario, String dataNascimento, String inscricaoFederal) {
		this.nome = nome;
	//	this.setor = setor;
	//	this.contato = contato;
	//	this.endereco = endereco;
	//	this.documento = documento;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
		this.inscricaoFederal = inscricaoFederal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getInscricaoFederal() {
		return inscricaoFederal;
	}

	public void setInscricaoFederal(String inscricaoFederal) {
		this.inscricaoFederal = inscricaoFederal;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", salario=" + salario + ", dataNascimento=" + dataNascimento
				+ ", inscricaoFederal=" + inscricaoFederal + "]";
	}
	
	
	
	
}
