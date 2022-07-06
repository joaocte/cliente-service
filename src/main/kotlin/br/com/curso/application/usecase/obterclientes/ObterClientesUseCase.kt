package br.com.curso.application.usecase.obterclientes

import br.com.curso.application.response.ClienteResponse
import br.com.curso.exception.custoException.ClienteNaoCadastradoException
import br.com.curso.extension.toClienteResponse
import br.com.curso.infrastructure.model.ClienteModel
import br.com.curso.infrastructure.repository.IClienteRepository
import jakarta.inject.Singleton

@Singleton
class ObterClientesUseCase(private val clienteRepository: IClienteRepository)  : IObterClientesUseCase{
 override   fun execute() : List<ClienteResponse>{

     if(!clienteRepository.existsAny())
     throw ClienteNaoCadastradoException()

     return clienteRepository.findAll()
        .map { it.toClienteResponse() }
 }
}

