package com.ua.sportnutrition.repository;

import com.ua.sportnutrition.domain.Supplement;

import java.util.List;
import java.util.Optional;

public interface SupplementRepository {

    List<Supplement> findAll();

    Optional<Supplement> findById(Long id);

    List<Supplement> findByCategory(String category);

    Supplement save(Supplement supplement);

    boolean deleteById(Long id);
}
