package br.com.curso.exception.Handlers

import br.com.curso.exception.custoException.ClienteJaCadastradoException
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
@Requires(classes = [ClienteJaCadastradoException::class])
class ClienteJaCadastradoExceptionHandler: ExceptionHandler<ClienteJaCadastradoException, HttpResponse<*>>
{
    override fun handle(request: HttpRequest<*>?, exception: ClienteJaCadastradoException): HttpResponse<*> {
        var erroResponse = ExceptionResponse(
            HttpStatus.CONFLICT,
            Errors.CSC1001.message,
            Errors.CSC1001.code
        )
        return HttpResponse
            .status<ExceptionResponse>(erroResponse.status)
            .body(erroResponse)

    }
}