package br.com.curso.application.command

data class AtualizarClienteCommand(val id : Long,
                                   val nome : String,
                                   val documento : String,
                                   val endereco : String)