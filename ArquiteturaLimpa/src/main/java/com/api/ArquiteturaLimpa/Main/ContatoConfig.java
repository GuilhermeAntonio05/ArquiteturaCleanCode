package com.api.ArquiteturaLimpa.Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.ArquiteturaLimpa.Application.Gateways.ContatoGateway;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudContatoInterector;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.ContatoEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.ContatoRepositoryGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoRepository;

@Configuration
public class ContatoConfig {

	@Bean
	CrudContatoInterector createContatoCase(ContatoGateway ContatoGateway) {
		return new CrudContatoInterector(ContatoGateway);
	}

	@Bean
	ContatoGateway contatoGateway(ContatoRepository ContatoRepository) {
		return new ContatoRepositoryGateway(ContatoRepository);
	}
	
	@Bean
	ContatoEntityMapper contatoEntityMapper(){
		return new ContatoEntityMapper();
	}
	
}
