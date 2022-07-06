package br.com.curso.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lbr/com/curso/controller/ClienteController;", "", "cadastrarClienteUseCase", "Lbr/com/curso/application/usecase/cadastrarcliente/ICadastrarClienteUseCase;", "obterClientesUseCase", "Lbr/com/curso/application/usecase/obterclientes/IObterClientesUseCase;", "obterClientePorIdUseCase", "Lbr/com/curso/application/usecase/obterclientes/IObterClientePorIdUseCase;", "deletarClientePorIdUseCase", "Lbr/com/curso/application/usecase/deletarcliente/IDeletarClientePorIdUseCase;", "atualizarClienteUseCase", "Lbr/com/curso/application/usecase/atualizarcliente/IAtualizarClienteUseCase;", "(Lbr/com/curso/application/usecase/cadastrarcliente/ICadastrarClienteUseCase;Lbr/com/curso/application/usecase/obterclientes/IObterClientesUseCase;Lbr/com/curso/application/usecase/obterclientes/IObterClientePorIdUseCase;Lbr/com/curso/application/usecase/deletarcliente/IDeletarClientePorIdUseCase;Lbr/com/curso/application/usecase/atualizarcliente/IAtualizarClienteUseCase;)V", "atualizarCliente", "", "id", "", "request", "Lbr/com/curso/application/request/AtualizarClienteRequest;", "criarCliente", "Lio/micronaut/http/HttpResponse;", "Lbr/com/curso/application/response/CadastrarClienteResponse;", "Lbr/com/curso/application/request/CadastrarClienteRequest;", "deletarCliente", "obterClientes", "Lbr/com/curso/application/response/ClienteResponse;", "obterTodosClientes", "", "cliente-service"})
@io.micronaut.http.annotation.Controller(value = "/clientes")
public final class ClienteController {
    private final br.com.curso.application.usecase.cadastrarcliente.ICadastrarClienteUseCase cadastrarClienteUseCase = null;
    private final br.com.curso.application.usecase.obterclientes.IObterClientesUseCase obterClientesUseCase = null;
    private final br.com.curso.application.usecase.obterclientes.IObterClientePorIdUseCase obterClientePorIdUseCase = null;
    private final br.com.curso.application.usecase.deletarcliente.IDeletarClientePorIdUseCase deletarClientePorIdUseCase = null;
    private final br.com.curso.application.usecase.atualizarcliente.IAtualizarClienteUseCase atualizarClienteUseCase = null;
    
    public ClienteController(@org.jetbrains.annotations.NotNull()
    br.com.curso.application.usecase.cadastrarcliente.ICadastrarClienteUseCase cadastrarClienteUseCase, @org.jetbrains.annotations.NotNull()
    br.com.curso.application.usecase.obterclientes.IObterClientesUseCase obterClientesUseCase, @org.jetbrains.annotations.NotNull()
    br.com.curso.application.usecase.obterclientes.IObterClientePorIdUseCase obterClientePorIdUseCase, @org.jetbrains.annotations.NotNull()
    br.com.curso.application.usecase.deletarcliente.IDeletarClientePorIdUseCase deletarClientePorIdUseCase, @org.jetbrains.annotations.NotNull()
    br.com.curso.application.usecase.atualizarcliente.IAtualizarClienteUseCase atualizarClienteUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post()
    public final io.micronaut.http.HttpResponse<br.com.curso.application.response.CadastrarClienteResponse> criarCliente(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.curso.application.request.CadastrarClienteRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final java.util.List<br.com.curso.application.response.ClienteResponse> obterTodosClientes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public final br.com.curso.application.response.ClienteResponse obterClientes(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public final io.micronaut.http.HttpResponse<kotlin.Unit> deletarCliente(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public final void atualizarCliente(@io.micronaut.http.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.curso.application.request.AtualizarClienteRequest request) {
    }
}