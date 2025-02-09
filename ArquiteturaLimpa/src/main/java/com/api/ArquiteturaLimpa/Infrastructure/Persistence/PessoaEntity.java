package com.api.ArquiteturaLimpa.Infrastructure.Persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class PessoaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private long id;
	
	@Column
	private String nome;

//	@OneToOne
	//private Setor setor;
	
	//@OneToMany
	//@JoinColumn(name = "PESSOA_ID ")
	//private List<Contato> contato;
	
//	@OneToMany
	//@JoinColumn(name = "PESSOA_ID ")
	//private List<Endereco> endereco;
	
	//@OneToMany
//	@JoinColumn(name = "PESSOA_ID ")
	//private List<Documento> documento;
	
	@Column
	private double salario;
	
	@Column
	private String dataNascimento;
	
	@Column
	private String inscricaoFederal;
	
	public PessoaEntity() {
	}

	public PessoaEntity(long id, String nome, double salario, String dataNascimento, String inscricaoFederal) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
		this.inscricaoFederal = inscricaoFederal;
	}

	public PessoaEntity(String nome, double salario, String dataNascimento, String inscricaoFederal) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
		this.inscricaoFederal = inscricaoFederal;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	
	
}