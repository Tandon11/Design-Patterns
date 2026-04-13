package org.example.strategies;

import org.example.interfaces.PaymentStrategy;

public class Upi implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "/- using upi...");
    }
}
