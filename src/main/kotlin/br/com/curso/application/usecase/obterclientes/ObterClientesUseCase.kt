package br.com.curso.application.usecase.obterclientes

import br.com.curso.application.query.ObterTodosClientesFilter
import br.com.curso.application.response.ClienteResponse
import br.com.curso.exception.custoException.ClienteNaoCadastradoException
import br.com.curso.extension.toClienteResponse
import br.com.curso.infrastructure.model.ClienteModel
import br.com.curso.infrastructure.repository.IClienteRepository
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable
import jakarta.inject.Singleton

@Singleton
class ObterClientesUseCase(private val clienteRepository: IClienteRepository)  : IObterClientesUseCase{
 override   fun execute(obterTodosClientesFilter: ObterTodosClientesFilter) : Page<ClienteResponse>{

     if(!clienteRepository.existsAny())
     throw ClienteNaoCadastradoException()

     obterTodosClientesFilter?.nome?.let {
         return clienteRepository.findByNomeContaining(obterTodosClientesFilter.nome ,obterTodosClientesFilter.pageable)
             .map { it.toClienteResponse() }
     }

     return clienteRepository.findAll(obterTodosClientesFilter.pageable)
        .map { it.toClienteResponse() }
 }
}

