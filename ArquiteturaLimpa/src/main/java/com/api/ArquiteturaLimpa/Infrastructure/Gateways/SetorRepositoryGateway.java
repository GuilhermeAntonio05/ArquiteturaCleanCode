package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.SetorGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.SetorEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.SetorRepository;

public class SetorRepositoryGateway implements SetorGateway {

	private SetorRepository setorRepository;

	public SetorRepositoryGateway(SetorRepository setorRepository) {
		this.setorRepository = setorRepository;
	}

	@Override
	public void salvar(SetorEntity setor) {
		setorRepository.save(setor);
	}

	@Override
	public Optional<SetorEntity> buscarPorId(Long id) {
		return setorRepository.findById(id);
	}

	@Override
	public void removerPorId(Long id) {
		setorRepository.getReferenceById(id);
	}

	@Override
	public List<SetorEntity> listaSetor() {
		return setorRepository.findAll();
	}
}
