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

import com.api.ArquiteturaLimpa.Application.UseCases.CrudContatoInterector;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudDocumentoInterector;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudEnderecoInterector;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudPessoaInterector;
import com.api.ArquiteturaLimpa.Application.UseCases.CrudSetorInterector;
import com.api.ArquiteturaLimpa.Domain.Entity.Pessoa;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.ContatoEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.DocumentoEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.EnderecoEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.PessoaEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Gateways.SetorEntityMapper;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.ContatoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.DocumentoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.EnderecoEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.PessoaEntity;
import com.api.ArquiteturaLimpa.Infrastructure.Persistence.SetorEntity;

@RestController
@RequestMapping("/api")
public class PessoaController {

	private CrudPessoaInterector crudPessoaInterector;
	private CrudSetorInterector crudSetorInterector;
	private CrudContatoInterector crudcontatoInterector;
	private CrudDocumentoInterector crudDocumentoInterector;
	private CrudEnderecoInterector crudEnderecoInterector;
	private PessoaEntityMapper pessoaEntityMapper;
	private SetorEntityMapper setorEntityMapper;
	private ContatoEntityMapper contatoEntityMapper;
	private DocumentoEntityMapper documentoEntityMapper;
	private EnderecoEntityMapper enderecoEntityMapper;

	public PessoaController(CrudPessoaInterector crudPessoaInterector, CrudSetorInterector crudSetorInterector,
			CrudContatoInterector crudcontatoInterector, CrudDocumentoInterector crudDocumentoInterector,
			CrudEnderecoInterector crudEnderecoInterector, PessoaEntityMapper pessoaEntityMapper,
			SetorEntityMapper setorEntityMapper, ContatoEntityMapper contatoEntityMapper,
			DocumentoEntityMapper documentoEntityMapper, EnderecoEntityMapper enderecoEntityMapper) {
		super();
		this.crudPessoaInterector = crudPessoaInterector;
		this.crudSetorInterector = crudSetorInterector;
		this.crudcontatoInterector = crudcontatoInterector;
		this.crudDocumentoInterector = crudDocumentoInterector;
		this.crudEnderecoInterector = crudEnderecoInterector;
		this.pessoaEntityMapper = pessoaEntityMapper;
		this.setorEntityMapper = setorEntityMapper;
		this.contatoEntityMapper = contatoEntityMapper;
		this.documentoEntityMapper = documentoEntityMapper;
		this.enderecoEntityMapper = enderecoEntityMapper;
	}

	@GetMapping
	public List<PessoaEntity> listarPessoas() {
		/*
		 * List<ContatoEntity> contatoEntities = new ArrayList<ContatoEntity>();
		 * contatoEntities.add(new ContatoEntity("Email", "porranaoaguentomais"));
		 * 
		 * SetorEntity setorEntity = new SetorEntity("chefe", "13");
		 * 
		 * List<EnderecoEntity> enderecoEntity = new ArrayList<EnderecoEntity>();
		 * enderecoEntity.add(new EnderecoEntity("226", "teste", "teste", "teste",
		 * "casa", "SC"));
		 * 
		 * List<DocumentoEntity> documentoEntity = new ArrayList<DocumentoEntity>();
		 * documentoEntity.add(new DocumentoEntity("cpf", "Vote no lula"));
		 * 
		 * PessoaEntity pessoaEntity = new PessoaEntity("Guilherme", setorEntity,
		 * contatoEntities, enderecoEntity, documentoEntity, 2000, "05", "insc");
		 * 
		 * System.out.println(documentoEntity.toString());
		 * 
		 * crudDocumentoInterector.salvar(documentoEntity);
		 * crudSetorInterector.salvar(setorEntity);
		 * crudcontatoInterector.salvarTodos(contatoEntities);
		 * crudEnderecoInterector.salvarTodos(enderecoEntity);
		 * crudPessoaInterector.salvar(pessoaEntity);
		 */
		return crudPessoaInterector.listaPessoa();
	}

	@GetMapping("/{id}")
	public Optional<PessoaEntity> listarPessoa(@PathVariable(name = "id") Long id) {
		return crudPessoaInterector.buscarPorId(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public void criarPessoa(@RequestBody Pessoa pessoa) {
		System.out.println("Ira criar uma pessoa");
		PessoaEntity pessoaEntity = pessoaEntityMapper.toEntity(pessoa);
		SetorEntity setorEntity = setorEntityMapper.toEntity(pessoa.getSetor());
		List<ContatoEntity> contatoEntity = contatoEntityMapper.toEntity(pessoa.getContato());
		List<EnderecoEntity> enderecoEntity = enderecoEntityMapper.toEntity(pessoa.getEndereco());
		List<DocumentoEntity> documentoEntity = documentoEntityMapper.toEntity(pessoa.getDocumento());

		crudDocumentoInterector.salvar(documentoEntity);
		System.out.println("Salvou documentos");
		crudSetorInterector.salvar(setorEntity);
		System.out.println("Salvou setor");
		crudcontatoInterector.salvar(contatoEntity);
		System.out.println("Salvou contato");
		crudEnderecoInterector.salvar(enderecoEntity);
		System.out.println("Salvou endereco");
		crudPessoaInterector.salvar(pessoaEntity);
		System.out.println("Salvou pessoa");
	}

	@DeleteMapping("/{id}")
	public void removerPessoa(@PathVariable(name = "id") Long id) {
		crudPessoaInterector.removerPorId(id);
	}

	@PutMapping("/{id}")
	public void atualizarPessoa(@PathVariable("id") Long id, @RequestBody Pessoa pessoa) {
		System.out.println("Ira criar uma pessoa");

		PessoaEntity pessoaEntity = pessoaEntityMapper.toEntity(pessoa);
		SetorEntity setorEntity = setorEntityMapper.toEntity(pessoa.getSetor());
		List<ContatoEntity> contatoEntity = contatoEntityMapper.toEntity(pessoa.getContato());
		List<EnderecoEntity> enderecoEntity = enderecoEntityMapper.toEntity(pessoa.getEndereco());
		List<DocumentoEntity> documentoEntity = documentoEntityMapper.toEntity(pessoa.getDocumento());

		crudDocumentoInterector.salvar(documentoEntity);
		System.out.println("Salvou documentos");
		crudSetorInterector.salvar(setorEntity);
		System.out.println("Salvou setor");
		crudcontatoInterector.salvar(contatoEntity);
		System.out.println("Salvou contato");
		crudEnderecoInterector.salvar(enderecoEntity);
		System.out.println("Salvou endereco");
		crudPessoaInterector.salvar(pessoaEntity);
		System.out.println("Salvou pessoa");

	}
}
