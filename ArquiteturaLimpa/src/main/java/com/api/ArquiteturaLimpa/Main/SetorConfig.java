package com.api.ArquiteturaLimpa.Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.ArquiteturaLimpa.Application.Gateways.SetorGateway;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudSetorInterector;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.SetorEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.SetorRepositoryGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.SetorRepository;

@Configuration
public class SetorConfig {

	@Bean
	CrudSetorInterector createSetorCase(SetorGateway SetorGateway) {
		return new CrudSetorInterector(SetorGateway);
	}

	@Bean
	SetorGateway setorGateway(SetorRepository SetorRepository) {
		return new SetorRepositoryGateway(SetorRepository);
	}
	
	@Bean
	SetorEntityMapper SetorEntityMapper () {
		return new SetorEntityMapper();
	}
}
