package com.superdev.codeplexbilheteriasapi.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class ErroAplicacao extends RuntimeException{

    private final HttpStatus status;
    private final String codigo;

    protected ErroAplicacao(HttpStatus status, String codigo, String mensagem){
        super(mensagem);
        this.status = status;
        this.codigo = codigo;
    }
}
