package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import com.api.ArquiteturaLimpa.Domain.Entity.Endereco;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoEntity;

public class EnderecoEntityMapper {
	public EnderecoEntity toEntity(Endereco endereco) {
		return new EnderecoEntity(endereco.getNumero(), endereco.getRua(), endereco.getBairro(),
				endereco.getComplemento(), endereco.getEstado(), endereco.getCep());
	}

	public Endereco toObj(EnderecoEntity endereco) {
		return new Endereco(endereco.getNumero(), endereco.getRua(), endereco.getBairro(), endereco.getComplemento(),
				endereco.getEstado(), endereco.getCep());
	}
}
