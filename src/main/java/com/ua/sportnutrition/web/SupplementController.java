package com.ua.sportnutrition.web;

import com.ua.sportnutrition.service.SupplementService;
import com.ua.sportnutrition.web.dto.SupplementCardDto;
import com.ua.sportnutrition.web.dto.SupplementDetailDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/supplements")
public class SupplementController {

    private final SupplementService supplementService;

    public SupplementController(SupplementService supplementService) {
        this.supplementService = supplementService;
    }

    @GetMapping
    public List<SupplementCardDto> list() {
        return supplementService.findAll();
    }

    @GetMapping("/{id}")
    public SupplementDetailDto getOne(@PathVariable Long id) {
        return supplementService.findById(id);
    }
}
