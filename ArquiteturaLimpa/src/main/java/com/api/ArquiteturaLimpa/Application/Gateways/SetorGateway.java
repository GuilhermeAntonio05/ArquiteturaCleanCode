package com.api.ArquiteturaLimpa.Application.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Domain.Entity.Setor;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.SetorEntity;

public interface SetorGateway {
	 public void salvar(SetorEntity setor);
	    public List<SetorEntity> listaSetor();
	    public Optional<SetorEntity> buscarPorId(Long id);
	    public void removerPorId(Long id);
}