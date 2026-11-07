package com.superdev.codeplexbilheteriasapi.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record EventoCompraCriarDto(
        @Schema(example = "12345678900")
        @NotBlank
        @Size(min = 11, max = 15)
        String cpf,

        @Schema(example = "67")
        @NotNull
        Integer quantidade,

        @Schema(example = "8372")
        @NotNull
        Integer cartao_final
)
{}
