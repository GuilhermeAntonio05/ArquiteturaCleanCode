package com.api.ArquiteturaLimpa.Application.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoEntity;

public interface ContatoGateway {
	public void salvar(ContatoEntity contatoEntity);
	public void salvarTodos(List<ContatoEntity> contatos);
	public List<ContatoEntity> listaContato();
	public Optional<ContatoEntity> buscarPorId(Long id);
	public void removerPorId(Long id);
}
