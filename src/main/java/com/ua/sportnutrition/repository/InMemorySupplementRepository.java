package com.ua.sportnutrition.repository;

import com.ua.sportnutrition.domain.Supplement;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemorySupplementRepository implements SupplementRepository {

    private final Map<Long, Supplement> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public List<Supplement> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<Supplement> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public Supplement save(Supplement supplement) {
        if (supplement.getId() == null) {
            supplement.setId(sequence.incrementAndGet());
        }
        storage.put(supplement.getId(), supplement);
        return supplement;
    }
}
