package com.superdev.codeplexbilheteriasapi.dtos;

public class CobrancaRespostaDto {
    CobrancaRespostaDto cobranca = pagamentosClient.post()
            .uri("/cobrancas")
            .body(new CobrancaCriarDto(valor, dado.cartaoFinal(), id, dado.quantidade()))
            .retrieve()
            .body(CobrancaRespostaDto.class);
}
