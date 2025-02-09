package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import com.api.ArquiteturaLimpa.Domain.Entity.Setor;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.SetorEntity;

public class SetorEntityMapper {
	public SetorEntity toEntity(SetorEntity setorEntity) {
		return new SetorEntity(setorEntity.getCargo(),setorEntity.getCargaHoraria());
	}
	
	public Setor toObj(SetorEntity setor) {
		return new Setor(setor.getCargo(),setor.getCargaHoraria());
	}
}
