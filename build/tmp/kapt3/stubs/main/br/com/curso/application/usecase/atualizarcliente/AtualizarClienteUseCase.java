package br.com.curso.application.usecase.atualizarcliente;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/curso/application/usecase/atualizarcliente/AtualizarClienteUseCase;", "Lbr/com/curso/application/usecase/atualizarcliente/IAtualizarClienteUseCase;", "clienteRepository", "Lbr/com/curso/infrastructure/repository/IClienteRepository;", "(Lbr/com/curso/infrastructure/repository/IClienteRepository;)V", "execute", "", "atualizarClienteCommand", "Lbr/com/curso/application/command/AtualizarClienteCommand;", "cliente-service"})
@javax.transaction.Transactional()
@jakarta.inject.Singleton()
public class AtualizarClienteUseCase implements br.com.curso.application.usecase.atualizarcliente.IAtualizarClienteUseCase {
    private final br.com.curso.infrastructure.repository.IClienteRepository clienteRepository = null;
    
    public AtualizarClienteUseCase(@org.jetbrains.annotations.NotNull()
    br.com.curso.infrastructure.repository.IClienteRepository clienteRepository) {
        super();
    }
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    br.com.curso.application.command.AtualizarClienteCommand atualizarClienteCommand) {
    }
}