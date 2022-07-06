package br.com.curso.infrastructure.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
@Entity
data class ClienteModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    var nome : String,
    var documento : String,
    var endereco : String
)
