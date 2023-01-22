package com.crudlover.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

/**
 * CarDTO
 */
public record CarDTO(
    @NotBlank String modelo,
    @NotBlank String fabricante,
    @NotBlank String dataFabricacao,
    @PositiveOrZero Integer valor,
    @PositiveOrZero Integer anoModelo
) {

}