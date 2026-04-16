package org.example.states;

import org.example.interfaces.TrafficLightState;

public class RedState implements TrafficLightState {
    @Override
    public void display() {
        System.out.println("RED  — Stop!");
    }

    @Override
    public TrafficLightState next() {
        return new GreenState();   // Red knows it goes to Green
    }
}