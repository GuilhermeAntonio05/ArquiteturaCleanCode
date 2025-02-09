package com.api.ArquiteturaLimpa.Application.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoEntity;

public interface EnderecoGateway {
	public void salvar(EnderecoEntity endereco);
	public void salvarTodos(List<EnderecoEntity> enderecos);
	public List<EnderecoEntity> listaEndereco();
	public Optional<EnderecoEntity> buscarPorId(Long id);
	public void removerPorId(Long id);
}
