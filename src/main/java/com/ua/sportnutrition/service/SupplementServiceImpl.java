package com.ua.sportnutrition.service;

import com.ua.sportnutrition.domain.Supplement;
import com.ua.sportnutrition.exception.SupplementNotFoundException;
import com.ua.sportnutrition.repository.SupplementRepository;
import com.ua.sportnutrition.service.mapper.SupplementMapper;
import com.ua.sportnutrition.web.dto.SupplementCardDto;
import com.ua.sportnutrition.web.dto.SupplementDetailDto;
import com.ua.sportnutrition.web.dto.SupplementRequest;
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
    public List<SupplementCardDto> findAll(String category) {
        List<Supplement> supplements = (category == null || category.isBlank())
                ? repository.findAll()
                : repository.findByCategory(category);
        return supplements.stream().map(mapper::toCard).toList();
    }

    @Override
    public SupplementDetailDto findById(Long id) {
        Supplement supplement = repository.findById(id)
                .orElseThrow(() -> new SupplementNotFoundException(id));
        return mapper.toDetail(supplement);
    }

    @Override
    public SupplementDetailDto create(SupplementRequest request) {
        Supplement supplement = mapper.toDomain(request);
        supplement.setId(null);
        return mapper.toDetail(repository.save(supplement));
    }

    @Override
    public SupplementDetailDto update(Long id, SupplementRequest request) {
        repository.findById(id)
                .orElseThrow(() -> new SupplementNotFoundException(id));
        Supplement supplement = mapper.toDomain(request);
        supplement.setId(id);
        return mapper.toDetail(repository.save(supplement));
    }

    @Override
    public void delete(Long id) {
        if (!repository.deleteById(id)) {
            throw new SupplementNotFoundException(id);
        }
    }
}
