package br.com.curso.application.usecase.obterclientes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lbr/com/curso/application/usecase/obterclientes/ObterClientesUseCase;", "Lbr/com/curso/application/usecase/obterclientes/IObterClientesUseCase;", "clienteRepository", "Lbr/com/curso/infrastructure/repository/IClienteRepository;", "(Lbr/com/curso/infrastructure/repository/IClienteRepository;)V", "execute", "", "Lbr/com/curso/application/response/ClienteResponse;", "cliente-service"})
@jakarta.inject.Singleton()
public final class ObterClientesUseCase implements br.com.curso.application.usecase.obterclientes.IObterClientesUseCase {
    private final br.com.curso.infrastructure.repository.IClienteRepository clienteRepository = null;
    
    public ObterClientesUseCase(@org.jetbrains.annotations.NotNull()
    br.com.curso.infrastructure.repository.IClienteRepository clienteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<br.com.curso.application.response.ClienteResponse> execute() {
        return null;
    }
}