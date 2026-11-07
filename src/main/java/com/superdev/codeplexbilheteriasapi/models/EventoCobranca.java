package com.superdev.codeplexbilheteriasapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "cobranca")
public class EventoCobranca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(length = 4, nullable = false, updatable = false)
    private Integer cartao_final;

    @Column
    private Integer valor;

    @Column
    private Integer id_evento;
}
