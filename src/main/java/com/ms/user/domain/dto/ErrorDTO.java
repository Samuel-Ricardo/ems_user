package com.ms.user.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record ErrorDTO(
        @NotBlank String message,
        @NotBlank String statusCode
) {}
