package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.PessoaGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.PessoaEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.PessoaRepository;

public class PessoaRepositoryGateway implements PessoaGateway {
	
	private final PessoaRepository pessoaRepository;

	public PessoaRepositoryGateway(PessoaRepository pessoaRepository) {
		super();
		this.pessoaRepository = pessoaRepository;
	}

	@Override
	public void salvar(PessoaEntity pessoa) {
		pessoaRepository.save(pessoa);
	}

	@Override
	public List<PessoaEntity> listaPessoa() {
		return pessoaRepository.findAll();
	}

	@Override
	public Optional<PessoaEntity> buscarPorId(Long id) {
		return pessoaRepository.findById(id);
	}
	
	@Override
	public void removerPorId(Long id) {
		pessoaRepository.deleteById(id);
	}

}
