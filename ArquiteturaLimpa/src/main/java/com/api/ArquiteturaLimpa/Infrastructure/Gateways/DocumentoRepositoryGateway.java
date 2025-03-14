package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Application.Gateways.DocumentoGateway;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoRepository;

public class DocumentoRepositoryGateway implements DocumentoGateway {

	private DocumentoRepository documentoRepository;

	public DocumentoRepositoryGateway(DocumentoRepository documentoRepository) {
		this.documentoRepository = documentoRepository;
	}

	@Override
	public void salvar(List<DocumentoEntity> list) {
		documentoRepository.saveAll(list);
	}

	@Override
	public void salvarTodos(List<DocumentoEntity> documentoEntity) {
		documentoRepository.saveAll(documentoEntity);
	}

	@Override
	public List<DocumentoEntity> listaDocumento() {
		return documentoRepository.findAll();
	}

	@Override
	public Optional<DocumentoEntity> buscarPorId(Long id) {
		return documentoRepository.findById(id);
	}

	@Override
	public void removerPorId(Long id) {
		documentoRepository.getReferenceById(id);
	}


}
