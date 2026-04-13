package org.example.shape;

import org.example.colour.Colour;

public class Circle extends Shape {
    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
        colour.applyColor();
    }
}
