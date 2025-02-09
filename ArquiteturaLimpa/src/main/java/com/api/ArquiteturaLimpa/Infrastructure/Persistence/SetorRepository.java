package com.api.ArquiteturaLimpa.Infrastructure.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ArquiteturaLimpa.Domain.Entity.Setor;

public interface SetorRepository extends JpaRepository<SetorEntity, Long>{
}
