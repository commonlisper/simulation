package com.github.application;

import com.github.domain.Field;
import com.github.view.ConsoleRenderer;

public class Simulation {
    private final Field field;

    public Simulation(Field field) {
        this.field = field;
    }

    public void start() {
        System.out.println("Simulation starts!");
        ConsoleRenderer.render(field);
    }

    public void stop() {
        System.out.println("Simulation stops!");
    }
}
