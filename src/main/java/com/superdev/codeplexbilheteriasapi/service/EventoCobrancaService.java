package com.superdev.codeplexbilheteriasapi.service;

import com.superdev.codeplexbilheteriasapi.dtos.EventoCobrancaDto;
import com.superdev.codeplexbilheteriasapi.exception.RegraNegocio;
import com.superdev.codeplexbilheteriasapi.models.EventoCobranca;
import com.superdev.codeplexbilheteriasapi.models.EventoCompra;
import com.superdev.codeplexbilheteriasapi.repositories.EventoCobrancaRepository;

public class EventoCobrancaService {

    private final EventoCobrancaRepository repository;

    public EventoCobrancaService(EventoCobrancaRepository repository) {
        this.repository = repository;
    }

    public EventoCobranca criar(EventoCobrancaDto dado) {

        if (dado.quantidade() <= 0) {
            throw new RegraNegocio(
                    "A quantidade tem que ser maior que 0"
            );
        }

        var eventoCobranca = EventoCompra.builder()
                
                .quantidade(dado.quantidade())
                .cartao_final(dado.cartao_final())
                .build();

        return this.repository.save(eventoCobranca);
    }
}
