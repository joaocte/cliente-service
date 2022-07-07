package br.com.curso.application.usecase.obterclientes

import br.com.curso.application.query.ObterTodosClientesFilter
import br.com.curso.application.response.ClienteResponse
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable

interface IObterClientesUseCase {
    fun execute(obterTodosClientesFilter: ObterTodosClientesFilter) : Page<ClienteResponse>
}