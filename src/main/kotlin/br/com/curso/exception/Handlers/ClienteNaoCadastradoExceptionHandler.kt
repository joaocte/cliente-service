package br.com.curso.exception.Handlers

import br.com.curso.exception.custoException.ClienteNaoCadastradoException
import br.com.curso.exception.customErrors.Errors
import br.com.curso.exception.response.ExceptionResponse
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.server.exceptions.ExceptionHandler
import jakarta.inject.Singleton

@Singleton
@Requires(classes = [ClienteNaoCadastradoException::class])
class ClienteNaoCadastradoExceptionHandler: ExceptionHandler<ClienteNaoCadastradoException, HttpResponse<*>>
{
    override fun handle(request: HttpRequest<*>?, exception: ClienteNaoCadastradoException): HttpResponse<*> {
        var erroResponse = ExceptionResponse(
            HttpStatus.NOT_FOUND,
            Errors.CSC1000.message,
            Errors.CSC1000.code
        )
        return HttpResponse.notFound(erroResponse)
    }
}