package br.com.curso.application.usecase.obterclientes

import br.com.curso.application.query.ObterClientePorIdQyery
import br.com.curso.application.response.ClienteResponse

interface IObterClientePorIdUseCase {
    fun execute(obterClientePorIdQyery: ObterClientePorIdQyery) : ClienteResponse
}