package br.com.curso.application.usecase.cadastrarcliente

import br.com.curso.application.command.CadastrarClienteCommand
import br.com.curso.application.response.CadastrarClienteResponse
import br.com.curso.exception.custoException.ClienteJaCadastradoException
import br.com.curso.extension.toModel
import br.com.curso.infrastructure.repository.IClienteRepository
import jakarta.inject.Singleton

@Singleton
class CadastrarClienteUseCase(private val clienteRepository: IClienteRepository) : ICadastrarClienteUseCase {
    override fun execute(cadastrarPessoaCommand: CadastrarClienteCommand) : CadastrarClienteResponse
    {
        var clienteJaCadastrado = clienteRepository.existsByDocumento(cadastrarPessoaCommand.documento)

        if(clienteJaCadastrado)
            throw ClienteJaCadastradoException()

        var cliente =   clienteRepository.save(cadastrarPessoaCommand.toModel())

        return  CadastrarClienteResponse(cliente.id!!)

    }
}

