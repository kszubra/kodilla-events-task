package com.kodilla.task.eventstask.event;

import org.springframework.context.ApplicationEvent;

import com.kodilla.task.eventstask.enumeration.CalculationOperation;

import lombok.Getter;

@Getter
public class CalculationEvent extends ApplicationEvent {

    private Double a;
    private Double b;
    private CalculationOperation operation;

    public CalculationEvent(Object source, Double a, Double b, CalculationOperation operation) {
        super(source);
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public String getEvent() {
        return String.format("%s %s %s", a, operation.getSign(), b);
    }

}
