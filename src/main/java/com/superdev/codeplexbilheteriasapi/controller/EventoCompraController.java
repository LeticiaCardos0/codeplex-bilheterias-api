package com.superdev.codeplexbilheteriasapi.controller;

import com.superdev.codeplexbilheteriasapi.dtos.EventoCompraCriarDto;
import com.superdev.codeplexbilheteriasapi.models.Evento;
import com.superdev.codeplexbilheteriasapi.models.EventoCompra;
import com.superdev.codeplexbilheteriasapi.service.EventoCompraService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("eventosCompra")
@Tag(name = "EventoCompra")

public class EventoCompraController {
    private final EventoCompraService service;

    public EventoCompraController(EventoCompraService service) {
        this.service = service;
    }

    @PostMapping
    public EventoCompra criar(
            @RequestBody @Valid EventoCompraCriarDto dto) {
        return service.criar(dto);
    }
}