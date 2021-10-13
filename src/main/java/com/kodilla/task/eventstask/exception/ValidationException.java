package com.kodilla.task.eventstask.exception;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ValidationException extends ResponseStatusException {

    private ValidationException(HttpStatus status, String reason) {
        super(status, reason);
    }

    public static ValidationException nullNumber() {
        return new ValidationException(BAD_REQUEST, "Number can not be null");
    }
    public static ValidationException zeroDivider() {
        return new ValidationException(BAD_REQUEST, "Can not divide by zero");
    }
    public static ValidationException notNumber() {
        return new ValidationException(BAD_REQUEST, "Provided input is not number");
    }
}
