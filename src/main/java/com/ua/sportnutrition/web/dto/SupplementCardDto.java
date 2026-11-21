package com.ua.sportnutrition.web.dto;

import java.math.BigDecimal;

public record SupplementCardDto(Long id,
                                String name,
                                String brand,
                                BigDecimal price,
                                String imageUrl) {
}
