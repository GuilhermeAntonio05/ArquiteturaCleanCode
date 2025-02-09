package com.api.ArquiteturaLimpa.Infrastructure.Gateways;

import com.api.ArquiteturaLimpa.Domain.Entity.Pessoa;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.PessoaEntity;

public class PessoaEntityMapper {
	public PessoaEntity toEntity(Pessoa pessoa) {
		return new PessoaEntity(pessoa.getNome(),pessoa.getSalario(), pessoa.getDataNascimento(), pessoa.getInscricaoFederal());
	}
	
	public Pessoa toObj(PessoaEntity pessoa) {
		return new Pessoa(pessoa.getNome(),pessoa.getSalario(), pessoa.getDataNascimento(), pessoa.getInscricaoFederal());
	}
}
