package org.example;

import org.example.strategies.CreditCard;
import org.example.strategies.Upi;

public class StrategyDemo {
    static void main() {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCard());
        cart.checkOut(2000);

        cart.setPaymentStrategy(new Upi());
        cart.checkOut(4000);
    }
}
