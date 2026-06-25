package com.bfs.projectstory.restapipracticefour.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record UpdateBookRequest(
        @NotBlank
        @Size(min = 1, max = 50)
        String title,

        @NotNull
        @Size(min = 20, max = 100)
        BigDecimal price
) {
}
