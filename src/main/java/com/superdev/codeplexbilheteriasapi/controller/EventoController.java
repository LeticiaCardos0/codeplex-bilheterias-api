package com.superdev.codeplexbilheteriasapi.controller;

import com.superdev.codeplexbilheteriasapi.dtos.EventoCriarDto;
import com.superdev.codeplexbilheteriasapi.models.Evento;
import com.superdev.codeplexbilheteriasapi.service.EventoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("eventos")
@Tag(name = "Evento")

public class EventoController {
    private final EventoService service;

    public EventoController(EventoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Evento> listar() {
        return this.service.listar();
    }

    @PostMapping
    public Evento criar(
            @RequestBody @Valid EventoCriarDto dto) {
        return service.criar(dto);
    }
    @GetMapping("/{id}")
    public Evento obterPorId(@PathVariable int id) {
        return service.obterPorId(id);
    }

}
