package com.api.ArquiteturaLimpa.Application.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoEntity;

public interface DocumentoGateway {
	public void salvar(DocumentoEntity documento);
    public void salvarTodos(List<DocumentoEntity> documentos);
    public List<DocumentoEntity> listaDocumento();
    public Optional<DocumentoEntity> buscarPorId(Long id);
    public void removerPorId(Long id);
}
