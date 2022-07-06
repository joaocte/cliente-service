package br.com.curso.application.usecase.cadastrarcliente;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lbr/com/curso/application/usecase/cadastrarcliente/ICadastrarClienteUseCase;", "", "execute", "Lbr/com/curso/application/response/CadastrarClienteResponse;", "cadastrarPessoaCommand", "Lbr/com/curso/application/command/CadastrarClienteCommand;", "cliente-service"})
public abstract interface ICadastrarClienteUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.curso.application.response.CadastrarClienteResponse execute(@org.jetbrains.annotations.NotNull()
    br.com.curso.application.command.CadastrarClienteCommand cadastrarPessoaCommand);
}