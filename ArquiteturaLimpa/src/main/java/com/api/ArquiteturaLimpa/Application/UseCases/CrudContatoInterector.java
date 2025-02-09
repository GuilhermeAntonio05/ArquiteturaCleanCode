package com.api.ArquiteturaLimpa.Application.UseCases;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.ContatoGateway;
import com.api.ArquiteturaLimpa.Domain.Entity.Contato;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoEntity;

public class CrudContatoInterector {

	private ContatoGateway contatoGateway;

	public CrudContatoInterector(ContatoGateway contatoRepository) {
		this.contatoGateway = contatoGateway;
	}

	public void salvar(ContatoEntity contato) {
		contatoGateway.salvar(contato);
	}

	public void salvarTodos(List<ContatoEntity> contatos) {
		contatoGateway.salvarTodos(contatos);
	}

	public List<ContatoEntity> listaContato() {
		return contatoGateway.listaContato();
	}

	public Optional<ContatoEntity> buscarPorId(Long id) {
		return contatoGateway.buscarPorId(id);
	}

	public void removerPorId(Long id) {
		contatoGateway.removerPorId(id);
	}

}
