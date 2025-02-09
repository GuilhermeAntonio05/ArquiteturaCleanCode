package com.api.ArquiteturaLimpa.Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.ArquiteturaLimpa.Application.Gateways.PessoaGateway;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudPessoaInterector;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.PessoaEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.PessoaRepositoryGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.PessoaRepository;

@Configuration
public class DocumentoConfig {

	@Bean
	CrudPessoaInterector createPessoaCase(PessoaGateway PessoaGateway) {
		return new CrudPessoaInterector(PessoaGateway);
	}

	@Bean
	PessoaGateway pessoaGateway(PessoaRepository pessoaRepository) {
		return new PessoaRepositoryGateway(pessoaRepository);
	}
	
	@Bean
	PessoaEntityMapper pessoaEntityMapper () {
		return new PessoaEntityMapper();
	}
}
