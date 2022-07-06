package br.com.curso.exception.Handlers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lbr/com/curso/exception/Handlers/DocumentoJaCadastradoExceptionHandler;", "Lio/micronaut/http/server/exceptions/ExceptionHandler;", "Lbr/com/curso/exception/custoException/DocumentoJaCadastradoException;", "Lio/micronaut/http/HttpResponse;", "()V", "handle", "request", "Lio/micronaut/http/HttpRequest;", "exception", "cliente-service"})
@io.micronaut.context.annotation.Requires(classes = {br.com.curso.exception.custoException.DocumentoJaCadastradoException.class})
@jakarta.inject.Singleton()
public final class DocumentoJaCadastradoExceptionHandler implements io.micronaut.http.server.exceptions.ExceptionHandler<br.com.curso.exception.custoException.DocumentoJaCadastradoException, io.micronaut.http.HttpResponse<?>> {
    
    public DocumentoJaCadastradoExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.micronaut.http.HttpResponse<?> handle(@org.jetbrains.annotations.Nullable()
    io.micronaut.http.HttpRequest<?> request, @org.jetbrains.annotations.NotNull()
    br.com.curso.exception.custoException.DocumentoJaCadastradoException exception) {
        return null;
    }
}