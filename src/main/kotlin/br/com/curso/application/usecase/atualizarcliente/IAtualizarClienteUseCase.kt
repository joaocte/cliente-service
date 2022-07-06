package br.com.curso.application.usecase.atualizarcliente

import br.com.curso.application.command.AtualizarClienteCommand

interface IAtualizarClienteUseCase {
    fun execute(atualizarClienteCommand: AtualizarClienteCommand)
}