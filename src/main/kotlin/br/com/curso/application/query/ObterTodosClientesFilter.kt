package br.com.curso.application.query

import io.micronaut.data.model.Pageable

data class ObterTodosClientesFilter (
    val nome: String?,
    val pageable: Pageable
)
