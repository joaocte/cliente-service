package br.com.curso.application.usecase.atualizarcliente

import br.com.curso.application.command.AtualizarClienteCommand
import br.com.curso.exception.custoException.ClienteNaoCadastradoException
import br.com.curso.exception.custoException.DocumentoJaCadastradoException
import br.com.curso.infrastructure.repository.IClienteRepository
import jakarta.inject.Singleton
import javax.transaction.Transactional

@Singleton
@Transactional
open class AtualizarClienteUseCase(private val clienteRepository: IClienteRepository) : IAtualizarClienteUseCase {
    override fun execute(atualizarClienteCommand: AtualizarClienteCommand){

        val clienteModel = clienteRepository.findById(atualizarClienteCommand.id)

        if(!clienteModel.isPresent)
            throw ClienteNaoCadastradoException()

        val clienteOld = clienteModel.get()

        if(atualizarClienteCommand.documento != clienteOld.documento)
        {
            val clienteJaCadastrado = clienteRepository.existsByDocumento(atualizarClienteCommand.documento)

            if(clienteJaCadastrado)
                throw DocumentoJaCadastradoException()
        }

        clienteOld.documento = atualizarClienteCommand.documento
        clienteOld.nome = atualizarClienteCommand.nome
        clienteOld.endereco = atualizarClienteCommand.endereco



        clienteRepository.save(clienteOld)


    }
}