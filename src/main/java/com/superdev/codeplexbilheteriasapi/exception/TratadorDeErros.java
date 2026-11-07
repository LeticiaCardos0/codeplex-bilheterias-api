package com.superdev.codeplexbilheteriasapi.exception;

import com.superdev.codeplexbilheteriasapi.dtos.ErroResposta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(ErroAplicacao.class)
    public ResponseEntity<ErroResposta> tratarErroAplicacao(ErroAplicacao exception){
        return ResponseEntity
                .status(exception.getStatus())
                .body(new ErroResposta(exception.getCodigo(), exception.getMessage(), List.of()));
    }
}
