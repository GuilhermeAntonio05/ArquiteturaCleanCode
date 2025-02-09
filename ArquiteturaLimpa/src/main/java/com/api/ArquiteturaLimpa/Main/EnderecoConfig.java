package com.api.ArquiteturaLimpa.Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.ArquiteturaLimpa.Application.Gateways.EnderecoGateway;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudEnderecoInterector;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.EnderecoEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.EnderecoRepositoryGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoRepository;

@Configuration
public class EnderecoConfig {

	@Bean
	CrudEnderecoInterector createEnderecoCase(EnderecoGateway enderecoGateway) {
		return new CrudEnderecoInterector(enderecoGateway);
	}

	@Bean
	EnderecoGateway enderecoGateway(EnderecoRepository enderecoRepository) {
		return new EnderecoRepositoryGateway(enderecoRepository);
	}
	
	@Bean
	EnderecoEntityMapper enderecoEntityMapper() {
		return new EnderecoEntityMapper();
	}
}
