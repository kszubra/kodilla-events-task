package com.kodilla.task.eventstask.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodilla.task.eventstask.service.CalculatorFacade;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/calculate")
public class CalculatorController {
    private final CalculatorFacade facade;

    @GetMapping("/add")
    public Double add(@RequestParam String a, @RequestParam String b) {
        return facade.add(a, b);
    }

    @GetMapping("/subtract")
    public Double subtract(@RequestParam String a, @RequestParam String b) {
        return facade.subtract(a, b);
    }

    @GetMapping("/multiply")
    public Double multiply(@RequestParam String a, @RequestParam String b) {
        return facade.multiply(a, b);
    }

    @GetMapping("/divide")
    public Double divide(@RequestParam String a, @RequestParam String b) {
        return facade.divide(a, b);
    }

}
