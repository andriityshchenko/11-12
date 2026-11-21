package com.ua.sportnutrition.service.mapper;

import com.ua.sportnutrition.domain.Supplement;
import com.ua.sportnutrition.web.dto.SupplementCardDto;
import com.ua.sportnutrition.web.dto.SupplementDetailDto;
import com.ua.sportnutrition.web.dto.SupplementRequest;
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

    public Supplement toDomain(SupplementRequest r) {
        Supplement s = new Supplement();
        s.setName(r.name());
        s.setBrand(r.brand());
        s.setPrice(r.price());
        s.setWeightGrams(r.weightGrams());
        s.setImageUrl(r.imageUrl());
        s.setDescription(r.description());
        s.setCategory(r.category());
        s.setFlavor(r.flavor());
        return s;
    }
}
