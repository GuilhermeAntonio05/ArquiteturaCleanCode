package com.api.ArquiteturaLimpa.Infrastructure.Persistence;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

	@OneToOne
	private SetorEntity setor;

	@OneToMany
	@JoinColumn(name = "PESSOA_ID ")
	private List<ContatoEntity> contato;

	@OneToMany
	@JoinColumn(name = "PESSOA_ID ")
	private List<EnderecoEntity> endereco;

	@OneToMany
	@JoinColumn(name = "PESSOA_ID ")
	private List<DocumentoEntity> documento;

	@Column
	private double salario;

	@Column
	private String dataNascimento;

	@Column
	private String inscricaoFederal;
	
	public PessoaEntity(){
		
	}
	
	public PessoaEntity(long id, String nome, SetorEntity setor, List<ContatoEntity> contato,
			List<EnderecoEntity> endereco, List<DocumentoEntity> documento, double salario, String dataNascimento,
			String inscricaoFederal) {
		super();
		this.id = id;
		this.nome = nome;
		this.setor = setor;
		this.contato = contato;
		this.endereco = endereco;
		this.documento = documento;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
		this.inscricaoFederal = inscricaoFederal;
	}

	public PessoaEntity(String nome, SetorEntity setor, List<ContatoEntity> contato, List<EnderecoEntity> endereco,
			List<DocumentoEntity> documento, double salario, String dataNascimento, String inscricaoFederal) {
		super();
		this.nome = nome;
		this.setor = setor;
		this.contato = contato;
		this.endereco = endereco;
		this.documento = documento;
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

	public SetorEntity getSetor() {
		return setor;
	}

	public void setSetor(SetorEntity setor) {
		this.setor = setor;
	}

	public List<ContatoEntity> getContato() {
		return contato;
	}

	public void setContato(List<ContatoEntity> contato) {
		this.contato = contato;
	}

	public List<EnderecoEntity> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoEntity> endereco) {
		this.endereco = endereco;
	}

	public List<DocumentoEntity> getDocumento() {
		return documento;
	}

	public void setDocumento(List<DocumentoEntity> documento) {
		this.documento = documento;
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

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "PessoaEntity [id=" + id + ", nome=" + nome + ", setor=" + setor + ", contato=" + contato + ", endereco="
				+ endereco + ", documento=" + documento + ", salario=" + salario + ", dataNascimento=" + dataNascimento
				+ ", inscricaoFederal=" + inscricaoFederal + "]";
	}
	
}