package br.com.curso.exception.customErrors

enum class Errors(val code: String, val message: String) {
    CSC1000("CSC-1000", "Registro não encontrado"),
    CSC1001("CSC-1001", "Cliente Já Cadastrado"),
    CSC1002("CSC-1002", "Documento Já utilizado por outro cliente."),
}