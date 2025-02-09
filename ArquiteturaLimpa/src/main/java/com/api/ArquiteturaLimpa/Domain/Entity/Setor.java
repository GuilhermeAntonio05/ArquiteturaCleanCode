package com.api.ArquiteturaLimpa.Domain.Entity;

public class Setor {
	private String Cargo;
	private String cargaHoraria;
	
	public Setor() {
	}
	
	public Setor(String cargo, String cargaHoraria) {
		super();
		Cargo = cargo;
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
	
	
}
