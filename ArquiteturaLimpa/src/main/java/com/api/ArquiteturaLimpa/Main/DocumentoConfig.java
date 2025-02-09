package com.api.ArquiteturaLimpa.Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.ArquiteturaLimpa.Application.Gateways.DocumentoGateway;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudDocumentoInterector;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.DocumentoEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.DocumentoRepositoryGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoRepository;

@Configuration
public class DocumentoConfig {

	@Bean
	CrudDocumentoInterector createDocumentoCase(DocumentoGateway documentoGateway) {
		return new CrudDocumentoInterector(documentoGateway);
	}

	@Bean
	DocumentoGateway documentoGateway(DocumentoRepository documentoRepository) {
		return new DocumentoRepositoryGateway(documentoRepository);
	}
	
	@Bean
	DocumentoEntityMapper DocumentoEntityMapper() {
		return new DocumentoEntityMapper();
	}
}
