package org.example.strategies;

import org.example.interfaces.PaymentStrategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "/- using credit card...");
    }
}
