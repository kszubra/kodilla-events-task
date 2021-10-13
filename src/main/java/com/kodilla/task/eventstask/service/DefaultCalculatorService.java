package com.kodilla.task.eventstask.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DefaultCalculatorService implements CalculatorFacade {
    private final Calculator calculator;
    private final ValidationService validationService;

    @Override
    public Double add(String a, String b) {
        validationService.validateNumbers(a, b);
        return calculator.add(
                Double.parseDouble(a),
                Double.parseDouble(b)
        );
    }

    @Override
    public Double subtract(String a, String b) {
        validationService.validateNumbers(a, b);
        return calculator.subtract(
                Double.parseDouble(a),
                Double.parseDouble(b)
        );
    }

    @Override
    public Double multiply(String a, String b) {
        validationService.validateNumbers(a, b);
        return calculator.multiply(
                Double.parseDouble(a),
                Double.parseDouble(b)
        );
    }

    @Override
    public Double divide(String a, String b) {
        validationService.validateNumbers(a, b);
        validationService.validateDivisor(b);
        return calculator.divide(
                Double.parseDouble(a),
                Double.parseDouble(b)
        );
    }
}
