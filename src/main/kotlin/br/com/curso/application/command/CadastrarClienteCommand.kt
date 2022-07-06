package br.com.curso.application.command

data class CadastrarClienteCommand(val nome : String,
                                   val documento : String,
                                   val endereco : String)