package br.com.curso.extension

import br.com.curso.application.command.AtualizarClienteCommand
import br.com.curso.application.command.CadastrarClienteCommand
import br.com.curso.application.command.DeletarClienteCommand
import br.com.curso.application.query.ObterClientePorIdQyery
import br.com.curso.application.request.AtualizarClienteRequest
import br.com.curso.application.request.CadastrarClienteRequest
import br.com.curso.application.response.ClienteResponse
import br.com.curso.infrastructure.model.ClienteModel

fun CadastrarClienteCommand.toModel() : ClienteModel {
    return ClienteModel(id = null,nome = this.nome, documento = this.documento, endereco = this.endereco)
}

 fun CadastrarClienteRequest.toCommand(): CadastrarClienteCommand {
    return CadastrarClienteCommand(this.nome, this.documento, this.endereco)
}
fun AtualizarClienteRequest.toCommand(id: Long): AtualizarClienteCommand{
    return AtualizarClienteCommand(id, this.nome, this.documento, this.endereco)
}
fun ClienteModel.toClienteResponse(): ClienteResponse {
    return  ClienteResponse(this.id!!, this.nome, this.documento, this.endereco)
}

fun Long.toObterClientePorIdQuery(): ObterClientePorIdQyery
{
    return ObterClientePorIdQyery(this)
}
fun Long.toDeletarClienteCommand(): DeletarClienteCommand {
    return DeletarClienteCommand(this)
}
