package com.ua.sportnutrition.service;

import com.ua.sportnutrition.web.dto.SupplementCardDto;
import com.ua.sportnutrition.web.dto.SupplementDetailDto;

import java.util.List;

public interface SupplementService {

    List<SupplementCardDto> findAll();

    SupplementDetailDto findById(Long id);
}
