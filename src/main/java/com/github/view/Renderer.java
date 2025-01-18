package com.github.view;

import com.github.domain.Field;

public abstract class Renderer {
    protected final Field field;

    public Renderer(Field field) {
        this.field = field;
    }

    public abstract void render();
}
