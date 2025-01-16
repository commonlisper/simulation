package com.github.domain;

import com.github.domain.entities.Coordinates;
import com.github.domain.entities.Entity;
import com.github.domain.entities.Grass;
import com.github.domain.entities.Tree;

import java.util.Random;

public final class Fields {
    private Fields() {
    }

    public static Field generateSampleField() {
        Field field = new Field(15, 10);
        Entity[] entities = new Entity[]{new Grass(), new Tree(), null};
        Random random = new Random();

        for (int i = 0; i < field.getHeight(); i++) {
            for (int j = 0; j < field.getWidth(); j++) {
                Entity entity = entities[random.nextInt(0, entities.length)];
                if (entity == null) continue;
                field.addEntity(new Coordinates(i, j), entity);
            }
        }

        return field;
    }
}
