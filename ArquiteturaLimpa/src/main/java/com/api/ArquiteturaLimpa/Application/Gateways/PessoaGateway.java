package com.api.ArquiteturaLimpa.Application.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Infrastructure.Persistence.PessoaEntity;

public interface PessoaGateway {
	public void salvar(PessoaEntity pessoa);
	public List<PessoaEntity> listaPessoa();
	public Optional<PessoaEntity> buscarPorId(Long id);
	public void removerPorId(Long id);
}
