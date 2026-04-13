package org.example;

import org.example.colour.Blue;
import org.example.colour.Red;
import org.example.shape.Circle;
import org.example.shape.Rectangle;
import org.example.shape.Shape;

public class BridgeDemo {
    static void main() {
        // We can mix and match shapes and colors freely!
        Shape redCircle = new Circle(new Red());
        Shape blueRectangle = new Rectangle(new Blue());

        redCircle.draw();
        blueRectangle.draw();
    }
}
