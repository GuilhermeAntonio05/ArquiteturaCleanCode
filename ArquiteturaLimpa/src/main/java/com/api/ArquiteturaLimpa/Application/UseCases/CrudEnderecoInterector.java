package com.api.ArquiteturaLimpa.Application.UseCases;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.EnderecoGateway;
import com.api.ArquiteturaLimpa.Domain.Entity.Endereco;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoEntity;

public class CrudEnderecoInterector {

	private EnderecoGateway enderecoGateway;

	public CrudEnderecoInterector(EnderecoGateway enderecoGateway) {
		this.enderecoGateway = enderecoGateway;
	}

	public void salvar(List<EnderecoEntity> enderecoEntity) {
		enderecoGateway.salvarTodos(enderecoEntity);
	}

	public void salvarTodos(List<EnderecoEntity> enderecos) {
		enderecoGateway.salvarTodos(enderecos);
	}

	public List<EnderecoEntity> listaEndereco() {
		return enderecoGateway.listaEndereco();
	}

	public Optional<EnderecoEntity> buscarPorId(Long id) {
		return enderecoGateway.buscarPorId(id);
	}

	public void removerPorId(Long id) {
		enderecoGateway.removerPorId(id);
	}

}
