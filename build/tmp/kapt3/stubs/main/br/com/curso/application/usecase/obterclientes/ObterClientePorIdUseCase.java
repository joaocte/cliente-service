package br.com.curso.application.usecase.obterclientes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/curso/application/usecase/obterclientes/ObterClientePorIdUseCase;", "Lbr/com/curso/application/usecase/obterclientes/IObterClientePorIdUseCase;", "clienteRepository", "Lbr/com/curso/infrastructure/repository/IClienteRepository;", "(Lbr/com/curso/infrastructure/repository/IClienteRepository;)V", "execute", "Lbr/com/curso/application/response/ClienteResponse;", "obterClientePorIdQyery", "Lbr/com/curso/application/query/ObterClientePorIdQyery;", "cliente-service"})
@jakarta.inject.Singleton()
public final class ObterClientePorIdUseCase implements br.com.curso.application.usecase.obterclientes.IObterClientePorIdUseCase {
    private final br.com.curso.infrastructure.repository.IClienteRepository clienteRepository = null;
    
    public ObterClientePorIdUseCase(@org.jetbrains.annotations.NotNull()
    br.com.curso.infrastructure.repository.IClienteRepository clienteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.curso.application.response.ClienteResponse execute(@org.jetbrains.annotations.NotNull()
    br.com.curso.application.query.ObterClientePorIdQyery obterClientePorIdQyery) {
        return null;
    }
}