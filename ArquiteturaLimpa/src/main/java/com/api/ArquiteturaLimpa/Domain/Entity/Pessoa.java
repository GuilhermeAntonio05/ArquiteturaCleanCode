package com.api.ArquiteturaLimpa.Domain.Entity;

import java.util.List;

import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.SetorEntity;

public class Pessoa {
	private String nome;
	private SetorEntity setor;
	private List<ContatoEntity> contato;
	private List<EnderecoEntity> endereco;
	private List<DocumentoEntity> documento;
	private double salario;
	private String dataNascimento;
	private String inscricaoFederal;

	public Pessoa() {
	}

	public Pessoa(String nome, SetorEntity setorEntity, List<ContatoEntity> list, List<EnderecoEntity> list2,
			List<DocumentoEntity> list3, double salario, String dataNascimento, String inscricaoFederal) {
		this.nome = nome;
		this.setor = setorEntity;
		this.contato = list;
		this.endereco = list2;
		this.documento = list3;
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

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", salario=" + salario + ", dataNascimento=" + dataNascimento
				+ ", inscricaoFederal=" + inscricaoFederal + "]";
	}

}
