package org.example.context;

import org.example.interfaces.TrafficLightState;
import org.example.states.RedState;

// Holds the current state. Has NO if/else — just delegates.
public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        currentState = new RedState();  // starts at Red
    }

    public void change() {
        currentState.display();                  // show current
        currentState = currentState.next();      // move to next
    }
}