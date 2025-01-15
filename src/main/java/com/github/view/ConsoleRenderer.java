package com.github.view;

import com.github.domain.Field;
import com.github.domain.entities.Coordinates;
import com.github.domain.entities.Entity;

public class ConsoleRenderer extends Renderer {
    private final static String EMPTY_FIELD = "-";

    @Override
    public void render(Field field) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < field.getHeight(); i++) {
            for (int j = 0; j < field.getWidth(); j++) {
                Entity entity = field.getEntity(new Coordinates(i, j));
                result.append(entity != null ? entity : EMPTY_FIELD).append("|");
            }
            result.append("\n");
        }

        System.out.println(result);
    }
}
