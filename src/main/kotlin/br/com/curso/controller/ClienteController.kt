package br.com.curso.controller

import br.com.curso.application.request.AtualizarClienteRequest
import br.com.curso.application.request.CadastrarClienteRequest
import br.com.curso.application.response.CadastrarClienteResponse
import br.com.curso.application.response.ClienteResponse
import br.com.curso.application.usecase.atualizarcliente.IAtualizarClienteUseCase
import br.com.curso.application.usecase.cadastrarcliente.ICadastrarClienteUseCase
import br.com.curso.application.usecase.deletarcliente.IDeletarClientePorIdUseCase
import br.com.curso.application.usecase.obterclientes.IObterClientePorIdUseCase
import br.com.curso.application.usecase.obterclientes.IObterClientesUseCase
import br.com.curso.extension.toCommand
import br.com.curso.extension.toDeletarClienteCommand
import br.com.curso.extension.toObterClientePorIdQuery
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*

@Controller("/clientes")
 class ClienteController(
    private val cadastrarClienteUseCase: ICadastrarClienteUseCase,
    private val obterClientesUseCase: IObterClientesUseCase,
    private val obterClientePorIdUseCase: IObterClientePorIdUseCase,
    private val deletarClientePorIdUseCase: IDeletarClientePorIdUseCase,
    private val atualizarClienteUseCase: IAtualizarClienteUseCase,
) {

    @Post
    fun criarCliente(@Body request: CadastrarClienteRequest): HttpResponse<CadastrarClienteResponse> {
        return HttpResponse.created(cadastrarClienteUseCase.execute(request.toCommand()))
    }

    @Get
    fun obterTodosClientes(): List<ClienteResponse> {
        return obterClientesUseCase.execute()
    }

    @Get("/{id}")
    fun obterClientes(@PathVariable id: Long): ClienteResponse {
        return obterClientePorIdUseCase.execute(id.toObterClientePorIdQuery())
    }

    @Delete("/{id}")
    fun deletarCliente(@PathVariable id: Long) : HttpResponse<Unit> {
        deletarClientePorIdUseCase.execute(id.toDeletarClienteCommand())

        return HttpResponse.noContent()
    }

    @Put("/{id}")
     fun atualizarCliente(@PathVariable id: Long, @Body request: AtualizarClienteRequest) {
        atualizarClienteUseCase.execute(request.toCommand(id))
    }
}

