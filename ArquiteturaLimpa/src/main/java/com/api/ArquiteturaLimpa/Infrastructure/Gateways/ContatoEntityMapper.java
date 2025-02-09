package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import com.api.ArquiteturaLimpa.Domain.Entity.Contato;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoEntity;

public class ContatoEntityMapper {
	public ContatoEntity toEntity(Contato contato) {
		return new ContatoEntity(contato.getTipo(), contato.getValor());
	}

	public Contato toEntity(ContatoEntity contato) {
		return new Contato(contato.getTipo(), contato.getValor());
	}
}
