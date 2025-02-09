package com.api.ArquiteturaLimpa.Application.UseCases;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.ArquiteturaLimpa.Application.Gateways.SetorGateway;
import com.api.ArquiteturaLimpa.Domain.Entity.Setor;

@Service
public class CrudSetorInterector {
	private SetorGateway setorGateway;

	public CrudSetorInterector(SetorGateway setorGateway) {
		this.setorGateway = setorGateway;
	}

	public void salvar(Setor cliente) {
		setorGateway.salvar(cliente);
	}

	public List<Setor> listaSetor() {
		return setorGateway.listaSetor();
	}

	public Optional<Setor> buscarPorId(Long id) {
		return setorGateway.buscarPorId(id);
	}

	public void removerPorId(Long id) {
		setorGateway.removerPorId(id);
	}

}
