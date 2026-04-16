package org.example.states;

import org.example.interfaces.TrafficLightState;

public class GreenState implements TrafficLightState {
    @Override
    public void display() {
        System.out.println("GREEN — Go!");
    }

    @Override
    public TrafficLightState next() {
        return new YellowState();  // Green knows it goes to Yellow
    }
}
