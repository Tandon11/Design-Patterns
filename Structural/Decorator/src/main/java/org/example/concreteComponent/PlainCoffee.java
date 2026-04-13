package org.example.concreteComponent;

import org.example.interfaces.Coffee;

public class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 15.0;
    }
}
