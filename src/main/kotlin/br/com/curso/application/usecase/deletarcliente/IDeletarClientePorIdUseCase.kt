package br.com.curso.application.usecase.deletarcliente

import br.com.curso.application.command.DeletarClienteCommand

interface IDeletarClientePorIdUseCase {
    fun execute(deletarClienteCommand: DeletarClienteCommand)
}