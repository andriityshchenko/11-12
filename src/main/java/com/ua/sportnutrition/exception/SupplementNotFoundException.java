package com.ua.sportnutrition.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SupplementNotFoundException extends RuntimeException {

    public SupplementNotFoundException(Long id) {
        super("Добавку з id=" + id + " не знайдено");
    }
}
