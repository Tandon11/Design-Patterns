package org.example;

import org.example.context.TrafficLight;

public class StatePatternDemo {
    static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.change();   // RED   — Stop!
        light.change();   // GREEN — Go!
        light.change();   // YELLOW — Slow down!
        light.change();   // RED   — Stop!  (cycles back)
    }
}