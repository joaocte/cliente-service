package br.com.curso.application.usecase.deletarcliente

import br.com.curso.application.command.DeletarClienteCommand
import br.com.curso.exception.custoException.ClienteNaoCadastradoException
import br.com.curso.infrastructure.repository.IClienteRepository
import jakarta.inject.Singleton


@Singleton
class DeletarClientePorIdUseCase(private val clienteRepository: IClienteRepository) : IDeletarClientePorIdUseCase {
    override fun execute(deletarClienteCommand: DeletarClienteCommand){
        var clienteCadastrado = clienteRepository.existsById(deletarClienteCommand.id)

        if(!clienteCadastrado)
            throw ClienteNaoCadastradoException()

        clienteRepository.deleteById(deletarClienteCommand.id)
    }
}