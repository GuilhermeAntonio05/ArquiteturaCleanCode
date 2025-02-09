package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import com.api.ArquiteturaLimpa.Domain.Entity.Documento;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoEntity;

public class DocumentoEntityMapper {
	public DocumentoEntity toEntity(Documento documento) {
		return new DocumentoEntity(documento.getTipo(),documento.getValor());
	}
	
	public Documento toEntity(DocumentoEntity documento) {
		return new Documento(documento.getTipo(),documento.getValor());
	}
}
