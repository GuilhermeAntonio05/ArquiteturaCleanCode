package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import java.util.List;
import java.util.stream.Collectors;

import com.api.ArquiteturaLimpa.Domain.Entity.Contato;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoEntity;

public class ContatoEntityMapper {
	public List<ContatoEntity> toEntity(List<ContatoEntity> list) {
	    return list.stream()
	               .map(contato -> new ContatoEntity(contato.getTipo(), contato.getValor()))
	               .collect(Collectors.toList());
	}


	public Contato toObj(ContatoEntity contato) {
		return new Contato(contato.getTipo(), contato.getValor());
	}
}
