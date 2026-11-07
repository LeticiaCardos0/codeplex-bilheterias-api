package com.superdev.codeplexbilheteriasapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 120,nullable = false)
    private String nome;

    @Column(name = "data_evento",nullable = false,updatable = false)
    private LocalDate dataEvento;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private Integer vagas;

    @PrePersist
    void aoCriar(){
        if (dataEvento == null)
            dataEvento = LocalDate.now();
    }



}
