package com.api.ArquiteturaLimpa.Application.UseCases;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.PessoaGateway;
import com.api.ArquiteturaLimpa.Domain.Entity.Pessoa;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.PessoaEntity;

public class CrudPessoaInterector{
	
	private PessoaGateway pessoaGateway;
	
	public CrudPessoaInterector(PessoaGateway pessoaGateway) {
		super();
		this.pessoaGateway = pessoaGateway;
	}

	public void salvar(PessoaEntity pessoa) {
		pessoaGateway.salvar(pessoa);
	}

	public List<PessoaEntity> listaPessoa() {
		return pessoaGateway.listaPessoa();
	}

	public Optional<PessoaEntity> buscarPorId(Long id) {
		return pessoaGateway.buscarPorId(id);
	}

	public void removerPorId(Long id) {
		pessoaGateway.removerPorId(id);
	}

}
