package com.kodilla.task.eventstask.service;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.kodilla.task.eventstask.exception.ValidationException;

@Component
public class ValidationService {

    public void validateNumbers(String a, String b) {
        validateNull(a);
        validateNull(b);
        validateNumber(a);
        validateNumber(b);
    }

    public void validateDivisor(String a) {
        validateNull(a);
        validateNumber(a);
        if(BigDecimal.valueOf(Double.parseDouble(a)).signum() == 0) {
            throw ValidationException.zeroDivider();
        }
    }

    private void validateNumber(String a) {
        try {
            Double.parseDouble(a);
        } catch (NumberFormatException e) {
            throw ValidationException.notNumber();
        }
    }

    private void validateNull(String a) {
        if(Objects.isNull(a)) {
            throw ValidationException.nullNumber();
        }
    }


}
