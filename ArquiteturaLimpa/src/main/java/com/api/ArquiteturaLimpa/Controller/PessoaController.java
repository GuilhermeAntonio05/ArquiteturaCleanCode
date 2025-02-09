package com.api.ArquiteturaLimpa.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.ArquiteturaLimpa.Application.UseCases.CrudPessoaInterector;
import com.api.ArquiteturaLimpa.Domain.Entity.Pessoa;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.PessoaEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.PessoaEntity;

@RestController
@RequestMapping("/api")
public class PessoaController {

	private CrudPessoaInterector crudPessoaInterector;
	private PessoaEntityMapper pessoaEntityMapper;

	public PessoaController(CrudPessoaInterector crudPessoaInterector,PessoaEntityMapper pessoaEntityMapper) {
		this.crudPessoaInterector = crudPessoaInterector;
		this.pessoaEntityMapper = pessoaEntityMapper;
	}

	@GetMapping
	public List<PessoaEntity> listarPessoas() {
		return crudPessoaInterector.listaPessoa();
	}

	@GetMapping("/{id}")
	public Optional<PessoaEntity> listarPessoa(@PathVariable(name = "id") Long id) {
		return crudPessoaInterector.buscarPorId(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void criarPessoa(@RequestBody Pessoa pessoa) {
		PessoaEntity pessoaEntity = pessoaEntityMapper.toEntity(pessoa);
		crudPessoaInterector.salvar(pessoaEntity);
	}

	@DeleteMapping("/{id}")
	public void removerPessoa(@PathVariable(name = "id") Long id) {
		crudPessoaInterector.removerPorId(id);
	}

	@PutMapping("/{id}")
	public void atualizarPessoa(@PathVariable("id") Long id, @RequestBody Pessoa pessoa) {
		PessoaEntity pessoaEntity = pessoaEntityMapper.toEntity(pessoa);
		crudPessoaInterector.salvar(pessoaEntity);
	}
}
