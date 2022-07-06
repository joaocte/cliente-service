package br.com.curso.application.usecase.obterclientes

import br.com.curso.application.response.ClienteResponse

interface IObterClientesUseCase {
    fun execute() : List<ClienteResponse>
}