package com.ua.sportnutrition.service.mapper;

import com.ua.sportnutrition.domain.Supplement;
import com.ua.sportnutrition.web.dto.SupplementCardDto;
import com.ua.sportnutrition.web.dto.SupplementDetailDto;
import org.springframework.stereotype.Component;

@Component
public class SupplementMapper {

    public SupplementCardDto toCard(Supplement s) {
        return new SupplementCardDto(
                s.getId(),
                s.getName(),
                s.getBrand(),
                s.getPrice(),
                s.getImageUrl());
    }

    public SupplementDetailDto toDetail(Supplement s) {
        return new SupplementDetailDto(
                s.getId(),
                s.getName(),
                s.getBrand(),
                s.getPrice(),
                s.getWeightGrams(),
                s.getImageUrl(),
                s.getDescription(),
                s.getCategory(),
                s.getFlavor());
    }
}
