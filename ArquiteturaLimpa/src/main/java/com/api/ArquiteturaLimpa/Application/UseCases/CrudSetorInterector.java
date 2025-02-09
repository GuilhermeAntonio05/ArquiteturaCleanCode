package com.api.ArquiteturaLimpa.Application.UseCases;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.ArquiteturaLimpa.Application.Gateways.SetorGateway;
import com.api.ArquiteturaLimpa.Domain.Entity.Setor;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.SetorEntity;

@Service
public class CrudSetorInterector {
	private SetorGateway setorGateway;

	public CrudSetorInterector(SetorGateway setorGateway) {
		this.setorGateway = setorGateway;
	}

	public void salvar(SetorEntity setor) {
		setorGateway.salvar(setor);
	}

	public List<SetorEntity> listaSetor() {
		return setorGateway.listaSetor();
	}
	
	public Optional<SetorEntity> buscarPorId(Long id) {
		return setorGateway.buscarPorId(id);
	}

	public void removerPorId(Long id) {
		setorGateway.removerPorId(id);
	}

}
