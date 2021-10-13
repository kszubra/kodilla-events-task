package com.kodilla.task.eventstask.enumeration;

import lombok.Getter;

@Getter
public enum CalculationOperation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String sign;

    CalculationOperation(String sign) {
        this.sign = sign;
    }
}
