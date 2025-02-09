package com.api.ArquiteturaLimpa.Application.UseCases;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.EnderecoGateway;
import com.api.ArquiteturaLimpa.Domain.Entity.Endereco;

public class CrudEnderecoInterector {

	private EnderecoGateway enderecoGateway;

	public CrudEnderecoInterector(EnderecoGateway enderecoGateway) {
		this.enderecoGateway = enderecoGateway;
	}

	public void salvar(Endereco endereco) {
		enderecoGateway.salvar(endereco);
	}

	public void salvarTodos(List<Endereco> enderecos) {
		enderecoGateway.salvarTodos(enderecos);
	}

	public List<Endereco> listaEndereco() {
		return enderecoGateway.listaEndereco();
	}

	public Optional<Endereco> buscarPorId(Long id) {
		return enderecoGateway.buscarPorId(id);
	}

	public void removerPorId(Long id) {
		enderecoGateway.removerPorId(id);
	}

}
