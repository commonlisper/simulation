package com.github;

import com.github.application.Simulation;
import com.github.domain.Field;
import com.github.domain.Fields;
import com.github.view.ConsoleRenderer;
import com.github.view.Renderer;

public class Main {
    public static void main(String[] args) {
        Field field = Fields.generateSampleField();
        Renderer renderer = new ConsoleRenderer();
        Simulation simulation = new Simulation(field, renderer);
        simulation.start();
    }
}