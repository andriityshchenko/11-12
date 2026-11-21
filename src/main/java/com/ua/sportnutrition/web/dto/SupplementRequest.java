package com.ua.sportnutrition.web.dto;

import java.math.BigDecimal;

public record SupplementRequest(
        String name,
        String brand,
        BigDecimal price,
        Integer weightGrams,
        String imageUrl,
        String description,
        String category,
        String flavor) {
}
