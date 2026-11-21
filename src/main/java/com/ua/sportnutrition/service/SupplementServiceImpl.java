package com.ua.sportnutrition.service;

import com.ua.sportnutrition.domain.Supplement;
import com.ua.sportnutrition.exception.SupplementNotFoundException;
import com.ua.sportnutrition.repository.SupplementRepository;
import com.ua.sportnutrition.service.mapper.SupplementMapper;
import com.ua.sportnutrition.web.dto.SupplementCardDto;
import com.ua.sportnutrition.web.dto.SupplementDetailDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplementServiceImpl implements SupplementService {

    private final SupplementRepository repository;
    private final SupplementMapper mapper;

    public SupplementServiceImpl(SupplementRepository repository, SupplementMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<SupplementCardDto> findAll() {
        return repository.findAll().stream()
                .map(mapper::toCard)
                .toList();
    }

    @Override
    public SupplementDetailDto findById(Long id) {
        Supplement supplement = repository.findById(id)
                .orElseThrow(() -> new SupplementNotFoundException(id));
        return mapper.toDetail(supplement);
    }
}
