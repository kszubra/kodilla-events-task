package com.kodilla.task.eventstask.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.kodilla.task.eventstask.enumeration.CalculationOperation;
import com.kodilla.task.eventstask.event.CalculationEvent;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SimpleCalculator implements Calculator, ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @Override
    public Double add(Double a, Double b) {
        publisher.publishEvent(new CalculationEvent(this, a, b, CalculationOperation.ADD));
        return a + b;
    }

    @Override
    public Double subtract(Double a, Double b) {
        publisher.publishEvent(new CalculationEvent(this, a, b, CalculationOperation.SUBTRACT));
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        publisher.publishEvent(new CalculationEvent(this, a, b, CalculationOperation.MULTIPLY));
        return a * b;
    }

    @Override
    public Double divide(Double a, Double b) {
        publisher.publishEvent(new CalculationEvent(this, a, b, CalculationOperation.DIVIDE));
        return a / b;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
