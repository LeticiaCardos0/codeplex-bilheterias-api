package com.superdev.codeplexbilheteriasapi.repositories;

import com.superdev.codeplexbilheteriasapi.models.EventoCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoCompraRepository extends JpaRepository<EventoCompra, Integer> {
}