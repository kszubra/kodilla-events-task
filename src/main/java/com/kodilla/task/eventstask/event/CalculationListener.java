package com.kodilla.task.eventstask.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.kodilla.task.eventstask.event.CalculationEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CalculationListener implements ApplicationListener<CalculationEvent> {

    @Override
    public void onApplicationEvent(CalculationEvent event) {
        log.info("Noticed calculation event: {}", event.getEvent());
    }
}
