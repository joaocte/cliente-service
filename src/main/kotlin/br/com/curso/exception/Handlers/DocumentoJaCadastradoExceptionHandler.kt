package br.com.curso.exception.Handlers

import br.com.curso.exception.custoException.ClienteNaoCadastradoException
import br.com.curso.exception.custoException.DocumentoJaCadastradoException
import br.com.curso.exception.customErrors.Errors
import br.com.curso.exception.response.ExceptionResponse
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.server.exceptions.ExceptionHandler
import jakarta.inject.Singleton

@Singleton
@Requires(classes = [DocumentoJaCadastradoException::class])
class DocumentoJaCadastradoExceptionHandler: ExceptionHandler<DocumentoJaCadastradoException, HttpResponse<*>>
{
    override fun handle(request: HttpRequest<*>?, exception: DocumentoJaCadastradoException): HttpResponse<*> {
        var erroResponse = ExceptionResponse(
            HttpStatus.BAD_REQUEST,
            Errors.CSC1002.message,
            Errors.CSC1002.code
        )
        return HttpResponse.badRequest(erroResponse)
    }
}