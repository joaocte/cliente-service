package br.com.curso.application.usecase.cadastrarcliente

import br.com.curso.application.command.CadastrarClienteCommand
import br.com.curso.application.response.CadastrarClienteResponse

interface ICadastrarClienteUseCase {
    fun execute(cadastrarPessoaCommand: CadastrarClienteCommand) : CadastrarClienteResponse
}