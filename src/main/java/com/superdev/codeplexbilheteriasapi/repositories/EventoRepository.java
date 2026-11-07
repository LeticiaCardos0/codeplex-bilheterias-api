package com.superdev.codeplexbilheteriasapi.repositories;

import com.superdev.codeplexbilheteriasapi.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
}
