package org.example.states;

import org.example.interfaces.TrafficLightState;

public class YellowState implements TrafficLightState {
    @Override
    public void display() {
        System.out.println("YELLOW — Slow down!");
    }

    @Override
    public TrafficLightState next() {
        return new RedState();     // Yellow knows it goes back to Red
    }
}
