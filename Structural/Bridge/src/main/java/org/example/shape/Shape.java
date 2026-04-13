package org.example.shape;

import org.example.colour.Colour;

public abstract class Shape {
    // The Bridge : Composition Instead of Inheritance
    protected Colour colour;

    protected Shape(Colour colour) {
        this.colour = colour;
    }

    public abstract void draw();
}
