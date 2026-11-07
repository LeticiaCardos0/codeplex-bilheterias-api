package com.superdev.codeplexbilheteriasapi.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.atn.LexerModeAction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record EventoCriarDto(
        @Schema(example = "Homen-Aranha")
        @NotBlank
        @Size(min = 5,max= 120)
        String nome,

        @Schema(example = "2026-11-07")
        @NotNull
        LocalDate dataEvento,

        @Schema(example = "30.50")
        @NotNull
        BigDecimal preco,

        @Schema(example = "20")
        @NotNull
        Integer vagas
) {
}
