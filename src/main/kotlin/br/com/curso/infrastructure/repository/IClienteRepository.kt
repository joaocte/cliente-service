package br.com.curso.infrastructure.repository

import br.com.curso.infrastructure.model.ClienteModel
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface IClienteRepository: JpaRepository<ClienteModel, Long> {
    fun existsByDocumento(documento: String) : Boolean
    fun existsAny(): Boolean
}