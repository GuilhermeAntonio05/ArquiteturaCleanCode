package com.api.ArquiteturaLimpa.Infrastructure.Persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_setor")
public class SetorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String Cargo;

	@Column
	private String cargaHoraria;

	public SetorEntity() {
	}

	public SetorEntity( String cargo, String cargaHoraria) {
		super();
		this.Cargo = cargo;
		this.cargaHoraria = cargaHoraria;
	}

	public SetorEntity(Long id, String cargo, String cargaHoraria) {
		super();
		this.id = id;
		this.Cargo = cargo;
		this.cargaHoraria = cargaHoraria;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Setor [id=" + id + ", Cargo=" + Cargo + ", cargaHoraria=" + cargaHoraria + "]";
	}
}