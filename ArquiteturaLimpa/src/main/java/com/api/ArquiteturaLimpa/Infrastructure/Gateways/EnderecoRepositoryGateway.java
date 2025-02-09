package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.EnderecoGateway;
import com.api.ArquiteturaLimpa.Domain.Entity.Endereco;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoRepository;

public class EnderecoRepositoryGateway implements EnderecoGateway {

	private EnderecoRepository enderecoRepository;

	public EnderecoRepositoryGateway(EnderecoRepository enderecoRepository) {
		this.enderecoRepository = enderecoRepository;
	}

	@Override
	public void salvar(EnderecoEntity enderecoEntity) {
		enderecoRepository.save(enderecoEntity);
	}

	@Override
	public void salvarTodos(List<EnderecoEntity> enderecos) {
		enderecoRepository.saveAll(enderecos);
	}

	@Override
	public Optional<EnderecoEntity> buscarPorId(Long id) {
		return enderecoRepository.findById(id);
	}

	@Override
	public void removerPorId(Long id) {
		enderecoRepository.getReferenceById(id);
	}

	@Override
	public List<EnderecoEntity> listaEndereco() {
		return enderecoRepository.findAll();
	}

}
