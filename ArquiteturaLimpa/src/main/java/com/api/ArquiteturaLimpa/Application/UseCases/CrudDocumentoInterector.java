package com.api.ArquiteturaLimpa.Application.UseCases;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.ArquiteturaLimpa.Application.Gateways.DocumentoGateway;
import com.api.ArquiteturaLimpa.Domain.Entity.Documento;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoEntity;

@Service
public class CrudDocumentoInterector {

	private DocumentoGateway documentoGateway;
	
    public CrudDocumentoInterector(DocumentoGateway documentoGateway) {
		this.documentoGateway = documentoGateway;
	}

	public void salvar(List<DocumentoEntity> list){
		documentoGateway.salvar(list);
    }

    public void salvarTodos(List<DocumentoEntity> documentoEntity){
    	documentoGateway.salvarTodos(documentoEntity);
    }

    public List<DocumentoEntity> listaDocumento(){
        return documentoGateway.listaDocumento();
    }

    public Optional<DocumentoEntity> buscarPorId(Long id){
        return documentoGateway.buscarPorId(id);
    }

    public void removerPorId(Long id){
    	documentoGateway.removerPorId(id);
    }
}
