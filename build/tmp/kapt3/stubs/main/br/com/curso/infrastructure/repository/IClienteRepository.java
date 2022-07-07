package br.com.curso.infrastructure.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lbr/com/curso/infrastructure/repository/IClienteRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/curso/infrastructure/model/ClienteModel;", "", "existsAny", "", "existsByDocumento", "documento", "", "findByNomeContaining", "Lio/micronaut/data/model/Page;", "nome", "pageable", "Lio/micronaut/data/model/Pageable;", "cliente-service"})
@io.micronaut.data.annotation.Repository()
public abstract interface IClienteRepository extends io.micronaut.data.jpa.repository.JpaRepository<br.com.curso.infrastructure.model.ClienteModel, java.lang.Long> {
    
    public abstract boolean existsByDocumento(@org.jetbrains.annotations.NotNull()
    java.lang.String documento);
    
    public abstract boolean existsAny();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.micronaut.data.model.Page<br.com.curso.infrastructure.model.ClienteModel> findByNomeContaining(@org.jetbrains.annotations.Nullable()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    io.micronaut.data.model.Pageable pageable);
}