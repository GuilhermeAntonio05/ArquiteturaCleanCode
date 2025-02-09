package com.api.ArquiteturaLimpa.Application.Gateways;

import java.util.List;
import java.util.Optional;

import com.api.ArquiteturaLimpa.Domain.Entity.Documento;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoEntity;

public interface DocumentoGateway {
	public void salvar(List<DocumentoEntity> list);
    public void salvarTodos(List<DocumentoEntity> documentoEntity);
    public List<DocumentoEntity> listaDocumento();
    public Optional<DocumentoEntity> buscarPorId(Long id);
    public void removerPorId(Long id);
}
