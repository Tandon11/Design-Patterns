package org.example.shape;

import org.example.colour.Colour;

public class Rectangle extends Shape {
    public Rectangle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
        colour.applyColor();
    }
}
