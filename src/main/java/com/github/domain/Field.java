package com.github.domain;

import com.github.domain.entities.Coordinates;
import com.github.domain.entities.Entity;

import java.util.HashMap;

public class Field {
    private final HashMap<Coordinates, Entity> map;
    private final int width;
    private final int height;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        map = new HashMap<>();
    }

    public void addEntity(Coordinates coordinates, Entity entity) {
        if (isValidCoordinates(coordinates.x(), coordinates.y())) {
            map.put(coordinates, entity);
        }
    }

    private boolean isValidCoordinates(int x, int y) {
        return x >= 0 && y >= 0 && x < height && y < width;
    }

    public Entity getEntity(Coordinates coordinates) {
        return map.getOrDefault(coordinates, null);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
