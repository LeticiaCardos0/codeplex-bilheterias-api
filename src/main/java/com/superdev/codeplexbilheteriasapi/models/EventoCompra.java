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
@Table(name = "compras")
public class EventoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 15, nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(length = 4, nullable = false, updatable = false)
    private Integer cartao_final;
}
