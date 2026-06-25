package com.bfs.projectstory.restapipracticefour.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public record UpdateBookResponse(
        String title,
        BigDecimal price
) {
}
