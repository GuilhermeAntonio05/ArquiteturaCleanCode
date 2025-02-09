package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.ContatoGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoRepository;

public class ContatoRepositoryGateway implements ContatoGateway {

	private ContatoRepository contatoRepository;

	public ContatoRepositoryGateway(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}

	@Override
	public void salvar(ContatoEntity contato) {
		contatoRepository.save(contato);
	}

	@Override
	public void salvarTodos(List<ContatoEntity> contatos) {
		contatoRepository.saveAll(contatos);
	}

	@Override
	public List<ContatoEntity> listaContato() {
		return contatoRepository.findAll();
	}

	@Override
	public Optional<ContatoEntity> buscarPorId(Long id) {
		return contatoRepository.findById(id);
	}

	@Override
	public void removerPorId(Long id) { 
		contatoRepository.deleteById(id);
	}

}
