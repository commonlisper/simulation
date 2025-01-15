package com.github.application;

import com.github.domain.Field;
import com.github.view.Renderer;

public class Simulation {
    private final Field field;
    private final Renderer renderer;

    public Simulation(Field field, Renderer renderer) {
        this.field = field;
        this.renderer = renderer;
    }

    public void start() {
        System.out.println("Simulation starts!");
        renderer.render(field);
    }

    public void stop() {

    }
}
