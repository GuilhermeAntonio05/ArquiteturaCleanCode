package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import java.util.List;
import java.util.stream.Collectors;

import com.api.ArquiteturaLimpa.Domain.Entity.Documento;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoEntity;

public class DocumentoEntityMapper {
	public List<DocumentoEntity> toEntity(List<DocumentoEntity> list) {
	    return list.stream()
	               .map(documento -> new DocumentoEntity(documento.getTipo(), documento.getValor()))
	               .collect(Collectors.toList());
	}

	
	public Documento toObj(List<DocumentoEntity> list) {
		return new Documento(((Documento) list).getTipo(),((Documento) list).getValor());
	}
}
