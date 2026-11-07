package com.superdev.codeplexbilheteriasapi.service;

import com.superdev.codeplexbilheteriasapi.dtos.EventoCriarDto;
import com.superdev.codeplexbilheteriasapi.exception.RegraNegocio;
import com.superdev.codeplexbilheteriasapi.models.Evento;
import com.superdev.codeplexbilheteriasapi.repositories.EventoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventoService {
    private final EventoRepository repository;

    public EventoService(EventoRepository repository){
        this.repository = repository;
    }
    public List<Evento> listar(){return this.repository.findAll() ;}

    public Evento obterPorId(int id){
        var evento = repository.findById(id).orElseThrow();
        return evento;
    }

    public Evento criar(EventoCriarDto dado) {
        var dataAtual = LocalDate.now();

        if (!dado.dataEvento().isAfter(dataAtual)) {
            throw new RegraNegocio("O evento precisa ser em uma data futura");
        }
        if (dado.preco().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RegraNegocio("O valor precisa ser maior que 0");
        }
        if (dado.vagas() >= 0){
            throw new RegraNegocio("Precisa ter mais que 0 vagas");
        }
        if (dado.nome() == ""){
            throw new RegraNegocio("O nome precisa ter mais de 5 caracteres");
        }

        var evento = Evento.builder()
                .nome(dado.nome())
                .dataEvento(dado.dataEvento())
                .preco(dado.preco())
                .vagas(dado.vagas())
                .build();
        return this.repository.save(evento);
    }
    }

