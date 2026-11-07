package com.superdev.codeplexbilheteriasapi.service;

import com.superdev.codeplexbilheteriasapi.dtos.EventoCompraCriarDto;
import com.superdev.codeplexbilheteriasapi.exception.RegraNegocio;
import com.superdev.codeplexbilheteriasapi.models.EventoCompra;
import com.superdev.codeplexbilheteriasapi.repositories.EventoCompraRepository;
import org.springframework.stereotype.Service;

@Service
public class EventoCompraService {

    private final EventoCompraRepository repository;

    public EventoCompraService(EventoCompraRepository repository) {
        this.repository = repository;
    }

    public EventoCompra criar(EventoCompraCriarDto dado) {

        if (dado.quantidade() <= 0) {
            throw new RegraNegocio(
                    "A quantidade tem que ser maior que 0"
            );
        }

        var eventoCompra = EventoCompra.builder()
                .cpf(dado.cpf())
                .quantidade(dado.quantidade())
                .cartao_final(dado.cartao_final())
                .build();

        return this.repository.save(eventoCompra);
    }
}