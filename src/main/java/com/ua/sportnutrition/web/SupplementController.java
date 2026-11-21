package com.ua.sportnutrition.web;

import com.ua.sportnutrition.service.SupplementService;
import com.ua.sportnutrition.web.dto.SupplementCardDto;
import com.ua.sportnutrition.web.dto.SupplementDetailDto;
import com.ua.sportnutrition.web.dto.SupplementRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplements")
public class SupplementController {

    private final SupplementService supplementService;

    public SupplementController(SupplementService supplementService) {
        this.supplementService = supplementService;
    }

    @GetMapping
    public List<SupplementCardDto> list(@RequestParam(required = false) String category) {
        return supplementService.findAll(category);
    }

    @GetMapping("/{id}")
    public SupplementDetailDto getOne(@PathVariable Long id) {
        return supplementService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SupplementDetailDto create(@RequestBody SupplementRequest request) {
        return supplementService.create(request);
    }

    @PutMapping("/{id}")
    public SupplementDetailDto update(@PathVariable Long id,
                                      @RequestBody SupplementRequest request) {
        return supplementService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        supplementService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
