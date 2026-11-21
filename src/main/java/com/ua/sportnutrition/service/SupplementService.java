package com.ua.sportnutrition.service;

import com.ua.sportnutrition.web.dto.SupplementCardDto;
import com.ua.sportnutrition.web.dto.SupplementDetailDto;
import com.ua.sportnutrition.web.dto.SupplementRequest;

import java.util.List;

public interface SupplementService {

    List<SupplementCardDto> findAll(String category);

    SupplementDetailDto findById(Long id);

    SupplementDetailDto create(SupplementRequest request);

    SupplementDetailDto update(Long id, SupplementRequest request);

    void delete(Long id);
}
