package br.com.curso.application.usecase.obterclientes

import br.com.curso.application.query.ObterClientePorIdQyery
import br.com.curso.application.response.ClienteResponse
import br.com.curso.exception.custoException.ClienteNaoCadastradoException
import br.com.curso.extension.toClienteResponse
import br.com.curso.infrastructure.repository.IClienteRepository
import jakarta.inject.Singleton

@Singleton
class ObterClientePorIdUseCase(private val clienteRepository: IClienteRepository) : IObterClientePorIdUseCase{
    override fun execute(obterClientePorIdQyery: ObterClientePorIdQyery) : ClienteResponse
    {
        var cliente =  clienteRepository.findById(obterClientePorIdQyery.id)

        if(!cliente.isPresent)
            throw ClienteNaoCadastradoException()

        return cliente.get().toClienteResponse()
    }
}