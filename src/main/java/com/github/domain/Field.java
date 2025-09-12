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

    public void add(Coordinates coordinates, Entity entity) {
        if (isValidCoordinates(coordinates)) {
            map.put(coordinates, entity);
        }
    }

    private boolean isValidCoordinates(Coordinates coordinates) {
        return coordinates.x() >= 0 &&
                coordinates.x() < height &&
                coordinates.y() >= 0 &&
                coordinates.y() < width;
    }

    public Entity get(Coordinates coordinates) {
        if (isValidCoordinates(coordinates)) {
            return map.get(coordinates);
        }

        throw new IllegalArgumentException("These are not valid coordinates!");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
