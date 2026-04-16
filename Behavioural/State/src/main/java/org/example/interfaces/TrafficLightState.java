package org.example.interfaces;

// Every state must know: what to display, and what comes next
public interface TrafficLightState {
    void display();
    TrafficLightState next();
}
