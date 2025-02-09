package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import java.util.List;
import java.util.stream.Collectors;

import com.api.ArquiteturaLimpa.Domain.Entity.Endereco;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoEntity;

public class EnderecoEntityMapper {
	public List<EnderecoEntity> toEntity(List<EnderecoEntity> list) {
	    return list.stream()
	               .map(endereco -> new EnderecoEntity(
	                   endereco.getNumero(),
	                   endereco.getRua(),
	                   endereco.getBairro(),
	                   endereco.getComplemento(),
	                   endereco.getEstado(),
	                   endereco.getCep()
	               ))
	               .collect(Collectors.toList());
	}


	public Endereco toObj(EnderecoEntity endereco) {
		return new Endereco(endereco.getNumero(), endereco.getRua(), endereco.getBairro(), endereco.getComplemento(),
				endereco.getEstado(), endereco.getCep());
	}
}
