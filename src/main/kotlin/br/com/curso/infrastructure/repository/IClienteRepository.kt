package br.com.curso.infrastructure.repository

import br.com.curso.infrastructure.model.ClienteModel
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable

@Repository
interface IClienteRepository: JpaRepository<ClienteModel, Long> {
    fun existsByDocumento(documento: String) : Boolean
    fun existsAny(): Boolean

    fun findByNomeContaining(nome: String?, pageable: Pageable) : Page<ClienteModel>
}